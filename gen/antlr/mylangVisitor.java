// Generated from D:/Compiler_final/src/main/java/antlr/mylang.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mylangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mylangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mylangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(mylangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(mylangParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#decl_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_var(mylangParser.Decl_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#assign_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_var(mylangParser.Assign_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#cond_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_if(mylangParser.Cond_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(mylangParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(mylangParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(mylangParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#outprint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutprint(mylangParser.OutprintContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#outprint_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutprint_arg(mylangParser.Outprint_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(mylangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mylangParser#block_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_comment(mylangParser.Block_commentContext ctx);
}