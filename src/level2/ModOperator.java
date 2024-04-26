package level2;

public class ModOperator implements Operator{
    @Override
    public double operate(double firstNumber, double secondNumber) {
        return firstNumber%secondNumber;
    }
}
