package syntax_interpreter;


import java.util.function.Function;

public class Aufg4 extends TestCalculate {
    @Override
    public Function<String, Double> createCalculateFunction() {
        return Aufg4.calculate;
    }
}
