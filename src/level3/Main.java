package level3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int select;
        boolean control = false;
        boolean stop = false;
        double firstNum;
        double secondNum;
        double radius;

        String operatorInput;
        ArithmeticCalculator calculator = new ArithmeticCalculator(new ArrayList<>(),Double.class);
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());
        Scanner sc = new Scanner(System.in);

        while (!stop) {
            System.out.println("1.사칙연산");
            System.out.println("2.원의 넓이");
            System.out.println("3.사칙 연산 기록 보기");
            System.out.println("4.원의 넓이 기록 보기");
            System.out.println("5.사칙연산 이전 기록 삭제");
            System.out.println("6.원의 넓이 이전 기록 삭제");
            System.out.println("7.숫자입력(사칙연산 기록중 입력한 수보다 큰값들 조회)");
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
                operatorInput = sc.nextLine();

                //이넘클래스에 입력값이 있는지 확인
                for (OperatorType ot : OperatorType.values()) {
                    if(operatorInput.charAt(0) == ot.getOp())
                        control = true;
                }
                if(control){
                    System.out.println((double)calculator.calculate(firstNum,secondNum,operatorInput.charAt(0)));
                }else{
                    throw new BadInputException("잘못된 연산자 입니다.");
                }

            }else if(select == 2){
                System.out.println("반지름을 입력하세요");
                if(sc.hasNextDouble()){
                    radius = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(circleCalculator.calculate(radius));
                }
            }else if(select == 3){
                calculator.listLook();
            }else if(select ==4){
                circleCalculator.listLook2();
            }else if (select ==5){
                calculator.removeResult();
            }else if(select ==6){
                circleCalculator.removeResult2();
            }else if (select == 7) {
                System.out.println("숫자를 입려하세요 :");
                double number = sc.nextDouble();
                sc.nextLine();
                calculator.resultsGreaterThan(number);
            } else if(select == 0){
                stop = true;
            }else{
                throw new BadInputException("1번과 2번중에 선택하세요");
            }


        }
    }
}
