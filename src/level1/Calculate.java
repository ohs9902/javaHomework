package level1;

import java.util.ArrayList;
import java.util.List;

public class Calculate {
    private double firstNumber;
    private double secondNumber;
    private char operator;
    private double result;

    public Calculate(double firstNumber, double secondNumber, char operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }
    public double operate(){
        double result = 0;
        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);
        switch (operator){
            case '+':
                result = firstNumber+secondNumber;
                this.result = result;
                break;
            case '-':
                result = firstNumber-secondNumber;
                this.result = result;
                break;
            case '*':
                result = firstNumber*secondNumber;
                this.result = result;
                break;
            case '/':
                result = firstNumber/secondNumber;
                this.result = result;
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", operator=" + operator +
                ", result=" + result;
    }
}
