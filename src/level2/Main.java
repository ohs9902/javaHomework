package level2;

import java.util.Scanner;

import static java.util.regex.Pattern.matches;

public class Main {
    private static final String OPER_REG = "[+\\-*/]";
    public static void main(String[] args) throws Exception {
        boolean stop = false;
        String control;
        double firstNum;
        double secondNum;
        String operator;

        Calculator calculator;
        Scanner sc = new Scanner(System.in);

        while (!stop) {
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
            while(true){
                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                control = sc.nextLine();
                if(control.equals("exit")){
                    stop = true;
                    break;
                } else if (control.equals("look")) {
                    calculator.listLook();
                }else if (control.equals("remove")){
                    calculator.removeResult();
                }else{
                    break;
                }
            }

        }
    }
}
