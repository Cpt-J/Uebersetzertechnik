package syntax_interpreter;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class EvalVisitor extends ExprBaseVisitor<Double> {

    @Override
    public Double visitCalc(ExprParser.CalcContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitNewline(ExprParser.NewlineContext ctx) {
        return 0.0;
    }

    @Override
    public Double visitDIV(ExprParser.DIVContext ctx) {
        return (double) visit(ctx.expr(0)) / visit(ctx.expr(1));
    }

    @Override
    public Double visitNumber(ExprParser.NumberContext ctx) {
        return Double.parseDouble(ctx.getText());
    }

    @Override
    public Double visitADD(ExprParser.ADDContext ctx) {
        return (double) visit(ctx.expr(0)) + visit(ctx.expr(1));

    }

    @Override
    public Double visitSUB(ExprParser.SUBContext ctx) {
        return (double) visit(ctx.expr(0)) - visit(ctx.expr(1));

    }

    @Override
    public Double visitParens(ExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitMUL(ExprParser.MULContext ctx) {
        return (double) visit(ctx.expr(0)) / visit(ctx.expr(1));

    }



}
