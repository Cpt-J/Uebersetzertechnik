package syntax_interpreter.Aufg4;

import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class EvalListener extends ExprBaseListener {
    ParseTreeProperty<Double> values = new ParseTreeProperty<>();

    @Override
    public void exitCalc(ExprParser.CalcContext ctx) {
        values.put(ctx, values.get(ctx.expr()));
    }



    @Override
    public void exitDIV(ExprParser.DIVContext ctx) {
        double left, right;
        left = values.get(ctx.expr(0));
        right = values.get(ctx.expr(1));
        values.put(ctx, left / right);
    }


    @Override
    public void exitNumber(ExprParser.NumberContext ctx) {
        values.put(ctx, Double.parseDouble(ctx.INT().getText()));
    }


    @Override
    public void exitADD(ExprParser.ADDContext ctx) {
        double left, right;
        left = values.get(ctx.expr(0));
        right = values.get(ctx.expr(1));
        values.put(ctx, left + right);
    }


    @Override
    public void exitSUB(ExprParser.SUBContext ctx) {
        double left, right;
        left = values.get(ctx.expr(0));
        right = values.get(ctx.expr(1));
        values.put(ctx, left - right);

    }


    @Override
    public void exitParens(ExprParser.ParensContext ctx) {
        values.put(ctx, values.get(ctx.expr()));
    }


    @Override
    public void exitMUL(ExprParser.MULContext ctx) {
        double left, right;
        left = values.get(ctx.expr(0));
        right = values.get(ctx.expr(1));
        values.put(ctx, left * right);

    }
}
