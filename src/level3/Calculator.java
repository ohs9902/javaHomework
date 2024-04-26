package level3;

public class Calculator<T extends Number> {
    private T radius;
    private T firstNumber;
    private T secondNumber;
    private Operator operator; //포함관계
    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }


    public double getFirstNumber() {
        return firstNumber.doubleValue();
    }

    public void setFirstNumber(T firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return  secondNumber.doubleValue();
    }

    public void setSecondNumber(T secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getRadius() {
        return radius.doubleValue();
    }


    public Calculator(T firstNumber, T secondNumber, Operator operator){ //사칙연산을 위한 생성자
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    public Calculator(T radius){ //원의 넓이를 구히기 위한 생성자
        this.radius = radius;
    }

    public double calculate() throws Exception { //오버라이딩 하기위해 정의
        throw new Exception("오버라이딩을 위한 메소드");
    }

}
