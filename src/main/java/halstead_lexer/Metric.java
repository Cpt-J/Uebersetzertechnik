package halstead_lexer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Metric {

    private static final int OPERATOR = 2;
    private static final int OPERAND = 3;

    public Map<String, Integer> operators = new HashMap<>();
    public Map<String, Integer> operands = new HashMap<>();
    public int operatorCount;
    public int operandCount;
    public int distinctOperatorCount;
    public int distinctOperandCount;
    public int programLength ;
    public int vocabularySize;
    public double volume;
    public double difficulty;
    public double effort;


    public static void main(String[] args) throws IOException {
        new Metric("E:\\OneDrive\\Java\\übs\\src\\main\\resources\\halstead\\eval1.c").printMetric();
//        new Metric("E:\\OneDrive\\Java\\übs\\src\\main\\resources\\halstead\\ggt2.c").printMetric();
    }

    public Metric(String filepath) throws IOException {
        CharStream input;
        if (filepath != null) {
            input = CharStreams.fromFileName(filepath);
        } else {
            input = CharStreams.fromStream(System.in);
        }

        Halstead lex = new Halstead(input);
        Token t = lex.nextToken();

        while (t == null || t.getType() != Halstead.EOF) {
            switch (t.getType()) {
                case OPERAND:
                    addToMap(t.getText(),operands );
                    break;
                case OPERATOR:
                    addToMap(t.getText().replaceAll("[ \t\r\n]", ""), operators);
                    break;

            }

            t = lex.nextToken();
        }
        calculateMetric();
    }

    private void printMetric() {
        STGroup g = new STGroupFile("template.stg");
        ST metricTemplate = g.getInstanceOf("metric");
        metricTemplate.add("m", this);
        System.out.println(metricTemplate.render());
    }

    private void calculateMetric(){
        distinctOperandCount = operands.size();
        distinctOperatorCount = operators.size();
        operandCount = operands.values().stream().reduce(0, (a,b) -> a+b);
        operatorCount = operators.values().stream().reduce(0, (a,b) -> a+b);
        programLength = operandCount + operatorCount;
        vocabularySize = distinctOperandCount + distinctOperatorCount;
        volume= programLength * Math.log(vocabularySize) / Math.log(2);
        difficulty = (distinctOperatorCount / 2.0) * ((double)operandCount / distinctOperandCount);
        effort = volume * difficulty;
    }



    public static void addToMap(String key, Map<String, Integer> map){
        if(map.containsKey(key)){
            map.put(key,map.get(key)+1);
        }else{
            map.put(key, 1);
        }
    }
}
