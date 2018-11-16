// Generated from E:/OneDrive/Java/übs/src/main/java/syntax_recognizer/aufg1\G6.g4 by ANTLR 4.7
package syntax_recognizer.aufg1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link G6Parser}.
 */
public interface G6Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link G6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(G6Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link G6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(G6Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link G6Parser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(G6Parser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link G6Parser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(G6Parser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link G6Parser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(G6Parser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link G6Parser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(G6Parser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link G6Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(G6Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link G6Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(G6Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link G6Parser#pot}.
	 * @param ctx the parse tree
	 */
	void enterPot(G6Parser.PotContext ctx);
	/**
	 * Exit a parse tree produced by {@link G6Parser#pot}.
	 * @param ctx the parse tree
	 */
	void exitPot(G6Parser.PotContext ctx);
	/**
	 * Enter a parse tree produced by {@link G6Parser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(G6Parser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link G6Parser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(G6Parser.FactContext ctx);
}