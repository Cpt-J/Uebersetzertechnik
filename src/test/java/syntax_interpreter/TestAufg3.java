package syntax_interpreter;


import java.util.function.Function;

public class Aufg3 extends TestCalculate {
    @Override
    public Function<String, Double> createCalculateFunction() {
        return Aufg3.calculate;
    }
}
