package level3;

public class MultiplyOperator<T extends Number> implements Operator {
    public final Class<T> type;

    public MultiplyOperator(Class<T> type) {
        this.type = type;
    }

    public Number operate(Number firstNumber, Number secondNumber){
        double result = firstNumber.doubleValue() * secondNumber.doubleValue();
        return NumberConversionUtils.convertNumberToType(result,this.type);
    }
}
