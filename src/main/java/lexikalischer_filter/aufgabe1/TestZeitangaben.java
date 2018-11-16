package lexikalischer_filter.aufgabe1;


import lexikalischer_filter.aufgabe1.lexer.Zeitangaben;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;

public class TestZeitangaben {
    public static void main(String[] args) {
        CharStream input = null;
        try{
            input = new ANTLRFileStream("E:\\OneDrive\\Java\\übs\\src\\main\\resources\\zeiten.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        STGroup g = new STGroupFile("template.stg");
        ST template = g.getInstanceOf("zeit");

        Zeitangaben lex = new Zeitangaben(input);
        Token t = null;
        do{
            t = lex.nextToken();
            template.add("t", t);
            //System.out.println("Line: " +t.getLine() + " Col:  " + t.getCharPositionInLine() + " Time:  " + t.getText());
        }while(t.getType() != Token.EOF);
        System.out.println(template.render());
    }
}
