package level2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private double radius;
    private double firstNumber;
    private double secondNumber;
    private Operator operator; //포함관계
    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }


    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getRadius() {
        return radius;
    }


    public Calculator(double firstNumber, double secondNumber, Operator operator){ //사칙연산을 위한 생성자
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    public Calculator(double radius){ //원의 넓이를 구히기 위한 생성자
        this.radius = radius;
    }

    public double calculate(){ //오버라이딩 하기위해 정의
        return 0;
    };

}
