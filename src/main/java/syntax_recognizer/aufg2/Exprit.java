package syntax_recognizer.aufg2;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Exprit {




    public static String getTree(String input) throws IOException {
        InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ExpritLexer lex = new ExpritLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
        ExpritParser parser = new ExpritParser(new CommonTokenStream(lex));
        ParseTree tree = parser.prog();

        return tree.toStringTree(parser);
    }
}
