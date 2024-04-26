package level3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number>  extends Calculator{
    private static List<Double> results = new ArrayList<>(); //객체를 새로 생성해도 적용되도록 static으로 선언

    public ArithmeticCalculator(T firstNumber, T secondNumber, Operator operator) {
        super(firstNumber, secondNumber, operator);
    }

    @Override
    public double calculate(){
        double result;
        results.add(getOperator().operate(getFirstNumber(),getSecondNumber())); //리스트에 추가
        return results.get(results.size()-1);
    }

    public static void listLook(){ //static List 참조를 위해 static 선언
        results.stream().forEach(System.out::println);
    }
    public static void removeResult(){ //static List 참조를 위해 static 선언
        results.remove(results.size()-1);
    }

    public static void resultsGreaterThan(double number){
        System.out.println(results.stream().filter((result) -> result>number).toList());
    }
}
