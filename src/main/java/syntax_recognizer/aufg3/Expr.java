package syntax_recognizer.aufg3;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Expr {

    public static void main(String[] args) throws IOException {
        System.out.println(getTree("1+1\n"));
        System.out.println(getTree("10/2*2+4\n"));
        System.out.println(getTree("1^2^3\n"));
        System.out.println(getTree("1=2=3\n"));
    }

    public static String getTree(String input) throws IOException {
        InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ExprLexer lex = new ExprLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
        ExprParser parser = new ExprParser(new CommonTokenStream(lex));
        ParseTree tree = parser.expr();

        return tree.toStringTree(parser);
    }
}
