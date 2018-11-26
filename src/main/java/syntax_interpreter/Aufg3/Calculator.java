package syntax_interpreter.Aufg3;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        double res = 0;
        while (res != -1){
            System.out.print("Eingabe: " );
            res = calculate(in.nextLine());
            System.out.println("Ergebnis: " + res);
        }
    }

    public static double calculate(String input) throws IOException {
        InputStream stream = new ByteArrayInputStream((input+"\n").getBytes(StandardCharsets.UTF_8));
        ExprLexer lex = new ExprLexer(CharStreams.fromStream(stream, StandardCharsets.UTF_8));
        ExprParser parser = new ExprParser(null);
        parser.setBuildParseTree(false); //Baum nicht aufbauen
        parser.setInputStream(new CommonTokenStream(lex));
        return parser.stat().v;

    }
}
