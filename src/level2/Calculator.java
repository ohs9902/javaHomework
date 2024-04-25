package level2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private double radius;
    private double firstNumber;
    private double secondNumber;
    private char operator;
    private boolean isCircle; //원의 넓이 계산인지 사칙연산 계산인지 판단하기 위한 변수


    ArithmeticCalculator ac = new ArithmeticCalculator();
    CircleCalculator cc = new CircleCalculator();
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Calculator(double firstNumber, double secondNumber, char operator){ //사칙연산을 위한 생성자
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
        this.isCircle = false;
    }

    public Calculator(double radius){ //원의 넓이를 구히기 위한 생성자
        this.radius = radius;
        this.isCircle = true;
    }

    public double calculate(){

        double result;
        if(!isCircle){
            result = ac.arithmeticCalculate(firstNumber,secondNumber,operator);
        }else{
            result = cc.calulateCircle(radius);
        }

        return result;
    }

}
