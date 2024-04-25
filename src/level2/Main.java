package level2;

import java.util.Scanner;

import static java.util.regex.Pattern.matches;

public class Main {
    private static final String OPER_REG = "[+\\-*/]"; //고정으로 사용하는 변수라 final로 상수로 선언
    public static void main(String[] args) throws Exception {
        int select;
        boolean stop = false;
        double firstNum;
        double secondNum;
        double radius;
        String operator;

        Calculator calculator;
        Scanner sc = new Scanner(System.in);

        while (!stop) {
            System.out.println("1.사칙연산");
            System.out.println("2.원의 넓이");
            System.out.println("3.사칙연산 기록 보기");
            System.out.println("4.원의 넓이 기록 보기");
            System.out.println("5.사칙연산 삭제");
            System.out.println("6.원의 넓이 삭제");
            System.out.println("0.종료");
            select = sc.nextInt();
            sc.nextLine();

            if(select == 1){
                System.out.println("첫번째 숫자를 입력하세요 : ");
                if(sc.hasNextDouble()){
                    firstNum = sc.nextDouble();
                    sc.nextLine();
                }else{
                    throw new BadInputException("숫자를 입력하세요");
                }
                System.out.println("두번째 숫자를 입력하세요 : ");
                if(sc.hasNextDouble()){
                    secondNum = sc.nextDouble();
                    sc.nextLine();
                }else{
                    throw new BadInputException("숫자를 입력하세요");
                }

                System.out.println("연산자를 입력하세요 : ");
                operator = sc.nextLine();
                if(operator.matches(OPER_REG)){
                    calculator = new Calculator(firstNum,secondNum,operator.charAt(0));
                    System.out.println(calculator.calculate());
                }else{
                    throw new BadInputException("없는 연산자 입니다.");
                }
            }else if(select == 2){
                System.out.println("반지름을 입력하세요");
                if(sc.hasNextDouble()){
                    radius = sc.nextDouble();
                    sc.nextLine();
                    calculator = new Calculator(radius);
                    System.out.println(calculator.calculate());
                }
            }else if(select == 3){
                ArithmeticCalculator.listLook();
            }else if(select == 4){
                CircleCalculator.listLook2();
            }else if (select ==5){
                ArithmeticCalculator.removeResult();
            } else if (select == 6) {
                CircleCalculator.removeResult2();
            } else if(select == 0){
                stop = true;
            }else{
                throw new BadInputException("1번과 2번중에 선택하세요");
            }


        }
    }
}
