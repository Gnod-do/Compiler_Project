// Generated from D:/Compiler_final/src/main/java/antlr/mylang.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mylangParser}.
 */
public interface mylangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mylangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(mylangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(mylangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(mylangParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(mylangParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#decl_var}.
	 * @param ctx the parse tree
	 */
	void enterDecl_var(mylangParser.Decl_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#decl_var}.
	 * @param ctx the parse tree
	 */
	void exitDecl_var(mylangParser.Decl_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void enterAssign_var(mylangParser.Assign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#assign_var}.
	 * @param ctx the parse tree
	 */
	void exitAssign_var(mylangParser.Assign_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#cond_if}.
	 * @param ctx the parse tree
	 */
	void enterCond_if(mylangParser.Cond_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#cond_if}.
	 * @param ctx the parse tree
	 */
	void exitCond_if(mylangParser.Cond_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(mylangParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(mylangParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(mylangParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(mylangParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(mylangParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(mylangParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#outprint}.
	 * @param ctx the parse tree
	 */
	void enterOutprint(mylangParser.OutprintContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#outprint}.
	 * @param ctx the parse tree
	 */
	void exitOutprint(mylangParser.OutprintContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#outprint_arg}.
	 * @param ctx the parse tree
	 */
	void enterOutprint_arg(mylangParser.Outprint_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#outprint_arg}.
	 * @param ctx the parse tree
	 */
	void exitOutprint_arg(mylangParser.Outprint_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(mylangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(mylangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#block_comment}.
	 * @param ctx the parse tree
	 */
	void enterBlock_comment(mylangParser.Block_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#block_comment}.
	 * @param ctx the parse tree
	 */
	void exitBlock_comment(mylangParser.Block_commentContext ctx);
}