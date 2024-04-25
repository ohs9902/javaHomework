package level2;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {

    private static List<Double> results = new ArrayList<>(); //객체를 새로 생성해도 적용되도록 static으로 선언
    public double arithmeticCalculate(double firstNumber, double secondNumber , char operator){
        switch (operator){
            case '+':
                results.add(firstNumber+secondNumber);
                break;
            case '-':
                results.add(firstNumber-secondNumber);
                break;
            case '*':
                results.add(firstNumber*secondNumber);
                break;
            case '/':
                results.add(firstNumber/secondNumber);
                break;

        }
        return results.get(results.size()-1);
    }

    public static void listLook(){ //static List 참조를 위해 static 선언
        results.stream().forEach(System.out::println);
    }
    public static void removeResult(){ //static List 참조를 위해 static 선언
        results.remove(results.size()-1);
    }
}
