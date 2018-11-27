package syntax_interpreter.Aufg2;


import syntax_interpreter.TestCalculate;
import syntax_interpreter.Aufg2.Calculator;
import java.util.function.Function;

public class TestAufg2 extends TestCalculate {
    @Override
    public Function<String, Double> createCalculateFunction() {
        return Calculator::calculate;
    }
}
