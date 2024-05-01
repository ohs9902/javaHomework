package level3;

public class ModOperator<T extends Number> implements Operator {

    public final Class<T> type;

    public ModOperator(Class<T> type) {
        this.type = type;
    }

    @Override
    public Number operate(Number firstNumber, Number secondNumber) {
        double result = firstNumber.doubleValue() % secondNumber.doubleValue();
        return NumberConversionUtils.convertNumberToType(result,this.type);
    }
}
