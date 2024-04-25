package level1;

public class Calculate {
    private double firstNumber;
    private double secondNumber;
    private char operator;

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

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

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
                break;
            case '-':
                result = firstNumber-secondNumber;
                break;
            case '*':
                result = firstNumber*secondNumber;
                break;
            case '/':
                result = firstNumber/secondNumber;
                break;
        }

        return result;
    }
}
