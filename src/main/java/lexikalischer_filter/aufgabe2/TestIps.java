package lexikalischer_filter.aufgabe2;

import lexikalischer_filter.aufgabe2.lexer.Ips;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;

public class TestIps {

    public static void main(String[] args) {
        CharStream input = null;
        try{
            input = new ANTLRFileStream("E:\\OneDrive\\Java\\übs\\src\\main\\resources\\ips.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        STGroup g = new STGroupFile("template.stg");
        ST template = g.getInstanceOf("ip");
        Ips lex = new Ips(input);
        Token t = null;
        do{
            t = lex.nextToken();
            template.add("t", t);
//            System.out.println(t.toString());
        }while(t.getType() != Token.EOF);
        System.out.println(template.render());
    }
}
