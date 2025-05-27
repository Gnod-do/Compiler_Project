// Generated from D:/Compiler_final/src/main/java/antlr/mylang.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class mylangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COND=1, ALT_COND=2, OTHERWISE=3, WHILELOOP=4, FORLOOP=5, OUTPRINT=6, TYPE_INT=7, 
		TYPE_BOOL=8, SET_TO=9, ADD=10, SUB=11, MULT=12, DIVIDE=13, REMAIN=14, 
		AND_OP=15, OR_OP=16, NEGATE=17, LT=18, GT=19, LTEQ=20, GTEQ=21, EQ_OP=22, 
		NEQ_OP=23, OPEN_PAREN=24, CLOSE_PAREN=25, OPEN_BLOCK=26, CLOSE_BLOCK=27, 
		LINE_END=28, SEP=29, COMM_BLOCK=30, VAR_NAME=31, DIGIT=32, STRING=33, 
		BOOL_LITERAL=34, WHITESPC=35;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_decl_var = 2, RULE_assign_var = 3, 
		RULE_cond_if = 4, RULE_while_loop = 5, RULE_for_loop = 6, RULE_code_block = 7, 
		RULE_outprint = 8, RULE_outprint_arg = 9, RULE_expression = 10, RULE_block_comment = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "decl_var", "assign_var", "cond_if", "while_loop", 
			"for_loop", "code_block", "outprint", "outprint_arg", "expression", "block_comment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'cond'", "'alt_cond'", "'otherwise'", "'loopwhile'", "'loopfor'", 
			"'outprint'", "'numtype'", "'booltype'", "':='", "'+'", "'-'", "'*'", 
			"'div'", "'mod'", "'and'", "'or'", "'not'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'('", "')'", "'{'", "'}'", "'.'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COND", "ALT_COND", "OTHERWISE", "WHILELOOP", "FORLOOP", "OUTPRINT", 
			"TYPE_INT", "TYPE_BOOL", "SET_TO", "ADD", "SUB", "MULT", "DIVIDE", "REMAIN", 
			"AND_OP", "OR_OP", "NEGATE", "LT", "GT", "LTEQ", "GTEQ", "EQ_OP", "NEQ_OP", 
			"OPEN_PAREN", "CLOSE_PAREN", "OPEN_BLOCK", "CLOSE_BLOCK", "LINE_END", 
			"SEP", "COMM_BLOCK", "VAR_NAME", "DIGIT", "STRING", "BOOL_LITERAL", "WHITESPC"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "mylang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mylangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mylangParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor ) return ((mylangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3221225970L) != 0)) {
				{
				{
				setState(24);
				stmt();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Decl_varContext decl_var() {
			return getRuleContext(Decl_varContext.class,0);
		}
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public Cond_ifContext cond_if() {
			return getRuleContext(Cond_ifContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public OutprintContext outprint() {
			return getRuleContext(OutprintContext.class,0);
		}
		public Block_commentContext block_comment() {
			return getRuleContext(Block_commentContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor ) return ((mylangVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
			case TYPE_BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				decl_var();
				}
				break;
			case VAR_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				assign_var();
				}
				break;
			case COND:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				cond_if();
				}
				break;
			case WHILELOOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(35);
				while_loop();
				}
				break;
			case FORLOOP:
				enterOuterAlt(_localctx, 5);
				{
				setState(36);
				for_loop();
				}
				break;
			case OUTPRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(37);
				outprint();
				}
				break;
			case COMM_BLOCK:
				enterOuterAlt(_localctx, 7);
				{
				setState(38);
				block_comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Decl_varContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(mylangParser.VAR_NAME, 0); }
		public TerminalNode LINE_END() { return getToken(mylangParser.LINE_END, 0); }
		public TerminalNode TYPE_INT() { return getToken(mylangParser.TYPE_INT, 0); }
		public TerminalNode TYPE_BOOL() { return getToken(mylangParser.TYPE_BOOL, 0); }
		public TerminalNode SET_TO() { return getToken(mylangParser.SET_TO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Decl_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).enterDecl_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).exitDecl_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor ) return ((mylangVisitor<? extends T>)visitor).visitDecl_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_varContext decl_var() throws RecognitionException {
		Decl_varContext _localctx = new Decl_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !(_la==TYPE_INT || _la==TYPE_BOOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(42);
			match(VAR_NAME);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SET_TO) {
				{
				setState(43);
				match(SET_TO);
				setState(44);
				expression(0);
				}
			}

			setState(47);
			match(LINE_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_varContext extends ParserRuleContext {
		public TerminalNode VAR_NAME() { return getToken(mylangParser.VAR_NAME, 0); }
		public TerminalNode SET_TO() { return getToken(mylangParser.SET_TO, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LINE_END() { return getToken(mylangParser.LINE_END, 0); }
		public Assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).enterAssign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).exitAssign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor ) return ((mylangVisitor<? extends T>)visitor).visitAssign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_varContext assign_var() throws RecognitionException {
		Assign_varContext _localctx = new Assign_varContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(VAR_NAME);
			setState(50);
			match(SET_TO);
			setState(51);
			expression(0);
			setState(52);
			match(LINE_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cond_ifContext extends ParserRuleContext {
		public TerminalNode COND() { return getToken(mylangParser.COND, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(mylangParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(mylangParser.OPEN_PAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(mylangParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(mylangParser.CLOSE_PAREN, i);
		}
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
		}
		public TerminalNode ALT_COND() { return getToken(mylangParser.ALT_COND, 0); }
		public TerminalNode OTHERWISE() { return getToken(mylangParser.OTHERWISE, 0); }
		public Cond_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).enterCond_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).exitCond_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor ) return ((mylangVisitor<? extends T>)visitor).visitCond_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_ifContext cond_if() throws RecognitionException {
		Cond_ifContext _localctx = new Cond_ifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cond_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(COND);
			setState(55);
			match(OPEN_PAREN);
			setState(56);
			expression(0);
			setState(57);
			match(CLOSE_PAREN);
			setState(58);
			code_block();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALT_COND) {
				{
				setState(59);
				match(ALT_COND);
				setState(60);
				match(OPEN_PAREN);
				setState(61);
				expression(0);
				setState(62);
				match(CLOSE_PAREN);
				setState(63);
				code_block();
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(67);
				match(OTHERWISE);
				setState(68);
				code_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILELOOP() { return getToken(mylangParser.WHILELOOP, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(mylangParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(mylangParser.CLOSE_PAREN, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor ) return ((mylangVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(WHILELOOP);
			setState(72);
			match(OPEN_PAREN);
			setState(73);
			expression(0);
			setState(74);
			match(CLOSE_PAREN);
			setState(75);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FORLOOP() { return getToken(mylangParser.FORLOOP, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(mylangParser.OPEN_PAREN, 0); }
		public List<Assign_varContext> assign_var() {
			return getRuleContexts(Assign_varContext.class);
		}
		public Assign_varContext assign_var(int i) {
			return getRuleContext(Assign_varContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LINE_END() { return getToken(mylangParser.LINE_END, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(mylangParser.CLOSE_PAREN, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor ) return ((mylangVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(FORLOOP);
			setState(78);
			match(OPEN_PAREN);
			setState(79);
			assign_var();
			setState(80);
			expression(0);
			setState(81);
			match(LINE_END);
			setState(82);
			assign_var();
			setState(83);
			match(CLOSE_PAREN);
			setState(84);
			code_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BLOCK() { return getToken(mylangParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(mylangParser.CLOSE_BLOCK, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor ) return ((mylangVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(OPEN_BLOCK);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3221225970L) != 0)) {
				{
				{
				setState(87);
				stmt();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(CLOSE_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutprintContext extends ParserRuleContext {
		public TerminalNode OUTPRINT() { return getToken(mylangParser.OUTPRINT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(mylangParser.OPEN_PAREN, 0); }
		public List<Outprint_argContext> outprint_arg() {
			return getRuleContexts(Outprint_argContext.class);
		}
		public Outprint_argContext outprint_arg(int i) {
			return getRuleContext(Outprint_argContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(mylangParser.CLOSE_PAREN, 0); }
		public TerminalNode LINE_END() { return getToken(mylangParser.LINE_END, 0); }
		public List<TerminalNode> SEP() { return getTokens(mylangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(mylangParser.SEP, i);
		}
		public OutprintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outprint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).enterOutprint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).exitOutprint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor ) return ((mylangVisitor<? extends T>)visitor).visitOutprint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutprintContext outprint() throws RecognitionException {
		OutprintContext _localctx = new OutprintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outprint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(OUTPRINT);
			setState(96);
			match(OPEN_PAREN);
			setState(97);
			outprint_arg();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(98);
				match(SEP);
				setState(99);
				outprint_arg();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(CLOSE_PAREN);
			setState(106);
			match(LINE_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Outprint_argContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(mylangParser.STRING, 0); }
		public TerminalNode VAR_NAME() { return getToken(mylangParser.VAR_NAME, 0); }
		public TerminalNode DIGIT() { return getToken(mylangParser.DIGIT, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(mylangParser.BOOL_LITERAL, 0); }
		public Outprint_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outprint_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).enterOutprint_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).exitOutprint_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor ) return ((mylangVisitor<? extends T>)visitor).visitOutprint_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outprint_argContext outprint_arg() throws RecognitionException {
		Outprint_argContext _localctx = new Outprint_argContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_outprint_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode NEGATE() { return getToken(mylangParser.NEGATE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(mylangParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(mylangParser.CLOSE_PAREN, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(mylangParser.BOOL_LITERAL, 0); }
		public TerminalNode VAR_NAME() { return getToken(mylangParser.VAR_NAME, 0); }
		public TerminalNode DIGIT() { return getToken(mylangParser.DIGIT, 0); }
		public TerminalNode MULT() { return getToken(mylangParser.MULT, 0); }
		public TerminalNode DIVIDE() { return getToken(mylangParser.DIVIDE, 0); }
		public TerminalNode REMAIN() { return getToken(mylangParser.REMAIN, 0); }
		public TerminalNode AND_OP() { return getToken(mylangParser.AND_OP, 0); }
		public TerminalNode ADD() { return getToken(mylangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(mylangParser.SUB, 0); }
		public TerminalNode OR_OP() { return getToken(mylangParser.OR_OP, 0); }
		public TerminalNode LT() { return getToken(mylangParser.LT, 0); }
		public TerminalNode GT() { return getToken(mylangParser.GT, 0); }
		public TerminalNode LTEQ() { return getToken(mylangParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(mylangParser.GTEQ, 0); }
		public TerminalNode EQ_OP() { return getToken(mylangParser.EQ_OP, 0); }
		public TerminalNode NEQ_OP() { return getToken(mylangParser.NEQ_OP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor ) return ((mylangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEGATE:
				{
				setState(111);
				match(NEGATE);
				setState(112);
				expression(10);
				}
				break;
			case OPEN_PAREN:
				{
				setState(113);
				match(OPEN_PAREN);
				setState(114);
				expression(0);
				setState(115);
				match(CLOSE_PAREN);
				}
				break;
			case BOOL_LITERAL:
				{
				setState(117);
				match(BOOL_LITERAL);
				}
				break;
			case VAR_NAME:
				{
				setState(118);
				match(VAR_NAME);
				}
				break;
			case DIGIT:
				{
				setState(119);
				match(DIGIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(123);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(126);
						match(AND_OP);
						setState(127);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(129);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(131);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(132);
						match(OR_OP);
						setState(133);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(134);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(135);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(136);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Block_commentContext extends ParserRuleContext {
		public TerminalNode COMM_BLOCK() { return getToken(mylangParser.COMM_BLOCK, 0); }
		public Block_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).enterBlock_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener ) ((mylangListener)listener).exitBlock_comment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor ) return ((mylangVisitor<? extends T>)visitor).visitBlock_comment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_commentContext block_comment() throws RecognitionException {
		Block_commentContext _localctx = new Block_commentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(COMM_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u0091\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004F\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0005\u0007Y\b\u0007\n\u0007\f\u0007"+
		"\\\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\be\b\b\n\b\f\bh\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\ny\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u008a\b\n\n\n\f\n\u008d\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0000"+
		"\u0001\u0014\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0000\u0005\u0001\u0000\u0007\b\u0001\u0000\u001f\"\u0001\u0000\f\u000e"+
		"\u0001\u0000\n\u000b\u0001\u0000\u0012\u0017\u0099\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000"+
		"\u0000\u00061\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\nG\u0001"+
		"\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000eV\u0001\u0000\u0000"+
		"\u0000\u0010_\u0001\u0000\u0000\u0000\u0012l\u0001\u0000\u0000\u0000\u0014"+
		"x\u0001\u0000\u0000\u0000\u0016\u008e\u0001\u0000\u0000\u0000\u0018\u001a"+
		"\u0003\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d"+
		"\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001"+
		"\u0001\u0000\u0000\u0000 (\u0003\u0004\u0002\u0000!(\u0003\u0006\u0003"+
		"\u0000\"(\u0003\b\u0004\u0000#(\u0003\n\u0005\u0000$(\u0003\f\u0006\u0000"+
		"%(\u0003\u0010\b\u0000&(\u0003\u0016\u000b\u0000\' \u0001\u0000\u0000"+
		"\u0000\'!\u0001\u0000\u0000\u0000\'\"\u0001\u0000\u0000\u0000\'#\u0001"+
		"\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000"+
		"\'&\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)*\u0007\u0000"+
		"\u0000\u0000*-\u0005\u001f\u0000\u0000+,\u0005\t\u0000\u0000,.\u0003\u0014"+
		"\n\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/0\u0005\u001c\u0000\u00000\u0005\u0001\u0000\u0000\u0000"+
		"12\u0005\u001f\u0000\u000023\u0005\t\u0000\u000034\u0003\u0014\n\u0000"+
		"45\u0005\u001c\u0000\u00005\u0007\u0001\u0000\u0000\u000067\u0005\u0001"+
		"\u0000\u000078\u0005\u0018\u0000\u000089\u0003\u0014\n\u00009:\u0005\u0019"+
		"\u0000\u0000:A\u0003\u000e\u0007\u0000;<\u0005\u0002\u0000\u0000<=\u0005"+
		"\u0018\u0000\u0000=>\u0003\u0014\n\u0000>?\u0005\u0019\u0000\u0000?@\u0003"+
		"\u000e\u0007\u0000@B\u0001\u0000\u0000\u0000A;\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CD\u0005\u0003\u0000"+
		"\u0000DF\u0003\u000e\u0007\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000F\t\u0001\u0000\u0000\u0000GH\u0005\u0004\u0000\u0000HI\u0005"+
		"\u0018\u0000\u0000IJ\u0003\u0014\n\u0000JK\u0005\u0019\u0000\u0000KL\u0003"+
		"\u000e\u0007\u0000L\u000b\u0001\u0000\u0000\u0000MN\u0005\u0005\u0000"+
		"\u0000NO\u0005\u0018\u0000\u0000OP\u0003\u0006\u0003\u0000PQ\u0003\u0014"+
		"\n\u0000QR\u0005\u001c\u0000\u0000RS\u0003\u0006\u0003\u0000ST\u0005\u0019"+
		"\u0000\u0000TU\u0003\u000e\u0007\u0000U\r\u0001\u0000\u0000\u0000VZ\u0005"+
		"\u001a\u0000\u0000WY\u0003\u0002\u0001\u0000XW\u0001\u0000\u0000\u0000"+
		"Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]^\u0005\u001b"+
		"\u0000\u0000^\u000f\u0001\u0000\u0000\u0000_`\u0005\u0006\u0000\u0000"+
		"`a\u0005\u0018\u0000\u0000af\u0003\u0012\t\u0000bc\u0005\u001d\u0000\u0000"+
		"ce\u0003\u0012\t\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000ij\u0005\u0019\u0000\u0000jk\u0005\u001c"+
		"\u0000\u0000k\u0011\u0001\u0000\u0000\u0000lm\u0007\u0001\u0000\u0000"+
		"m\u0013\u0001\u0000\u0000\u0000no\u0006\n\uffff\uffff\u0000op\u0005\u0011"+
		"\u0000\u0000py\u0003\u0014\n\nqr\u0005\u0018\u0000\u0000rs\u0003\u0014"+
		"\n\u0000st\u0005\u0019\u0000\u0000ty\u0001\u0000\u0000\u0000uy\u0005\""+
		"\u0000\u0000vy\u0005\u001f\u0000\u0000wy\u0005 \u0000\u0000xn\u0001\u0000"+
		"\u0000\u0000xq\u0001\u0000\u0000\u0000xu\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y\u008b\u0001\u0000\u0000"+
		"\u0000z{\n\b\u0000\u0000{|\u0007\u0002\u0000\u0000|\u008a\u0003\u0014"+
		"\n\t}~\n\u0007\u0000\u0000~\u007f\u0005\u000f\u0000\u0000\u007f\u008a"+
		"\u0003\u0014\n\b\u0080\u0081\n\u0006\u0000\u0000\u0081\u0082\u0007\u0003"+
		"\u0000\u0000\u0082\u008a\u0003\u0014\n\u0007\u0083\u0084\n\u0005\u0000"+
		"\u0000\u0084\u0085\u0005\u0010\u0000\u0000\u0085\u008a\u0003\u0014\n\u0006"+
		"\u0086\u0087\n\u0004\u0000\u0000\u0087\u0088\u0007\u0004\u0000\u0000\u0088"+
		"\u008a\u0003\u0014\n\u0005\u0089z\u0001\u0000\u0000\u0000\u0089}\u0001"+
		"\u0000\u0000\u0000\u0089\u0080\u0001\u0000\u0000\u0000\u0089\u0083\u0001"+
		"\u0000\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u008a\u008d\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u0015\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u001e\u0000\u0000\u008f\u0017\u0001"+
		"\u0000\u0000\u0000\n\u001b\'-AEZfx\u0089\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}