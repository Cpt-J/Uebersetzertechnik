package syntax_recognizer.aufg1;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class G6 {


    public static String getTree(String input) throws IOException {
        InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        G6Lexer lex = new G6Lexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
        G6Parser parser = new G6Parser(new CommonTokenStream(lex));
        ParseTree tree = parser.expr();

        return tree.toStringTree(parser);
    }
}
