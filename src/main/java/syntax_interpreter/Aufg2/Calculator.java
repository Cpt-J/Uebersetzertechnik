package syntax_interpreter.Aufg2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Calculator {
    public static double calculate(String input) throws IOException {
        InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ExprLexer lex = new ExprLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
        ExprParser parser = new ExprParser(new CommonTokenStream(lex));
        ParseTree tree = parser.stat();
        EvalVisitor visitor = new EvalVisitor();
        return visitor.visit(tree);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(calculate("1+2/3\n"));
    }
}
