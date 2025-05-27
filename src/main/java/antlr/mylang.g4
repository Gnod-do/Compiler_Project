grammar mylang;
program: (stmt)* EOF;
// operation for
stmt
: decl_var
| assign_var
| cond_if
| while_loop
| for_loop
| outprint
| block_comment
;
// variable declaration
decl_var
: (TYPE_INT | TYPE_BOOL) VAR_NAME (SET_TO expression)? LINE_END
;
// assignment
assign_var
: VAR_NAME SET_TO expression LINE_END
;
// operation if (с elif и else)
cond_if
: COND OPEN_PAREN expression CLOSE_PAREN code_block (ALT_COND OPEN_PAREN
expression CLOSE_PAREN code_block)? (OTHERWISE code_block)?
;
// while
while_loop
: WHILELOOP OPEN_PAREN expression CLOSE_PAREN code_block
;
// for
for_loop
: FORLOOP OPEN_PAREN assign_var expression LINE_END assign_var
CLOSE_PAREN code_block
;
// block OTHERWISE
code_block
: OPEN_BLOCK stmt* CLOSE_BLOCK
;
// вconsole output (supports strings, numbers, variables, booleans)
outprint
: OUTPRINT OPEN_PAREN outprint_arg (SEP outprint_arg)* CLOSE_PAREN
LINE_END
;
// arguments for outprint
outprint_arg
: STRING
| VAR_NAME
| DIGIT
| BOOL_LITERAL
;
expression
: NEGATE expression
| OPEN_PAREN expression CLOSE_PAREN
| expression (MULT | DIVIDE | REMAIN) expression
| expression AND_OP expression
| expression (ADD | SUB) expression
| expression OR_OP expression
| expression (LT | GT | LTEQ | GTEQ | EQ_OP | NEQ_OP) expression
| BOOL_LITERAL
| VAR_NAME
| DIGIT
;
block_comment
: COMM_BLOCK
;
// tokens
// key words
COND : 'cond';
ALT_COND : 'alt_cond';
OTHERWISE : 'otherwise';
WHILELOOP : 'loopwhile';
FORLOOP : 'loopfor';
OUTPRINT : 'outprint';
// data type
TYPE_INT : 'numtype';
TYPE_BOOL : 'booltype';
// operators
SET_TO : ':=';
ADD : '+';
SUB : '-';
MULT : '*';
DIVIDE : 'div';
REMAIN : 'mod';
AND_OP : 'and';
OR_OP : 'or';
NEGATE : 'not';
LT : '<';
GT : '>';
LTEQ : '<=';
GTEQ : '>=';
EQ_OP : '==';
NEQ_OP : '!=';
// brackets and separators
OPEN_PAREN : '(';
CLOSE_PAREN : ')';
OPEN_BLOCK : '{';
CLOSE_BLOCK : '}';
LINE_END : '.';
SEP : ',';
// multi-line comments
COMM_BLOCK : '/*' .*? '*/';
// identifiers, strings and numbers
VAR_NAME : [a-zA-Z_][a-zA-Z0-9_]*;
DIGIT : [0-9]+;
STRING : '"' (~["])* '"';
BOOL_LITERAL : '(T)' | '(F)';
// spaces and line breaks
WHITESPC : [ \t\r\n]+ -> skip;