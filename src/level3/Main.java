package level3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int select;

        boolean stop = false;
        double firstNum = 0;
        double secondNum = 0;
        double radius;

        String operatorInput;
        ArithmeticCalculator calculator = new ArithmeticCalculator(new ArrayList<>(),Double.class);
        CircleCalculator circleCalculator = new CircleCalculator(new ArrayList<>());
        Scanner sc = new Scanner(System.in);

        while (!stop) {
            try{
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

            }catch(Exception e){
                sc.nextLine();
                continue;
            }

            if(select == 1){
                while (true){
                    boolean control = false;
                    try{
                        System.out.println("첫번째 숫자를 입력하세요 : ");
                        firstNum = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("두번째 숫자를 입력하세요 : ");
                        secondNum = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("연산자를 입력하세요 : ");
                        operatorInput = sc.nextLine();

                        //이넘클래스에 입력값이 있는지 확인
                        for (OperatorType ot : OperatorType.values()) {
                            if(operatorInput.charAt(0) == ot.getOp()){
                                control = true;
                                break;
                            }
                        }

                        if(control){
                            System.out.println((double)calculator.calculate(firstNum,secondNum,operatorInput.charAt(0)));
                        }else{
                            System.out.println("잘못된 연산자입니다.");
                            continue;
                        }
                        break;
                    }catch (InputMismatchException e){
                        System.out.println("잘못된 입력입니다.");
                        sc.nextLine();

                    }
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
                throw new BadInputException("숫자를 입력하세요.");
            }


        }
    }
}
