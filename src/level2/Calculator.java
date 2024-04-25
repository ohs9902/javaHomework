package level2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private char operator;

    private static List<Double> results = new ArrayList<>();

    public Calculator(double firstNumber, double secondNumber, char operator){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }
    public List<Double> getResults() {
        return results;
    }

    public void setResults(List<Double> results) {
        this.results = results;
    }

    public double calculate(){
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

    public void listLook(){
        results.stream().forEach(System.out::println);
    }
    public void removeResult(){
        results.remove(results.size()-1);
    }
}
