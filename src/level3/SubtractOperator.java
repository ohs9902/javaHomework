package level3;

public class SubtractOperator<T extends Number> implements Operator {
    public final Class<T> type;

    public SubtractOperator(Class<T> type) {
        this.type = type;
    }

    public Number operate(Number firstNumber, Number secondNumber){
        double result = firstNumber.doubleValue() - secondNumber.doubleValue();
        return NumberConversionUtils.convertNumberToType(result,this.type);
    }
}
