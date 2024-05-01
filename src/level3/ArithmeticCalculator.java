package level3;

import java.util.List;

public class ArithmeticCalculator<T extends Number>  extends Calculator{
    public final Class<T> type;
    Operator op;
    public ArithmeticCalculator(List<Double> results, Class<T> type) {
        super(results);
        this.type = type;
    }


    public T calculate(T num1,T num2,char operator){

            switch (operator) {
                case '+':
                    op = new AddOperator(this.type);
                    break;
                case '-':
                    op = new SubtractOperator(this.type);
                    break;
                case '*':
                    op = new MultiplyOperator(this.type);
                    break;
                case '/':
                    op = new DivideOperator(this.type);
                    break;
                case '%':
                    op = new ModOperator(this.type);
                    break;
            }
        //리스트에 추가
        super.results.add((double)op.operate(num1,num2));
        return (T)results.get(results.size()-1);
    }

    public void listLook(){ //static List 참조를 위해 static 선언
        super.results.stream().forEach(System.out::println);
    }
    public void removeResult(){ //static List 참조를 위해 static 선언
        results.remove(results.size()-1);
    }

    public void resultsGreaterThan(double number){
        System.out.println(results.stream().filter((result) -> result>number).toList());
    }
}
