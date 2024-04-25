package level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculate[] calList = new Calculate[10];  //계산 조회 리스트
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String stop;
        while (true){

            System.out.println("첫번째 숫자를 입력하세요 : ");
            double firstNum = sc.nextDouble();
            sc.nextLine();
            System.out.println("두번째 숫자를 입력하세요 : ");
            double secondNum = sc.nextDouble();
            sc.nextLine();
            System.out.println("연산자를 입력하세요 : ");
            String operator = sc.nextLine();
            Calculate calculate = new Calculate(firstNum,secondNum,operator.charAt(0));

            if(operator.equals('/') || secondNum==0){
                System.out.println("나눗셈 연산중 분모를 0으로 할 수 없습니다.");
                continue;
            }

            System.out.println("계산 결과입니다 : " + calculate.operate());
            if(count==10){
                for (int i = 0; i < calList.length-1 ; i++) {
                    calList[i] = calList[i+1];
                }
                calList[calList.length-1] = calculate;
            }else{
                calList[count] = calculate;
                count++;
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            stop = sc.nextLine();
            if (stop.equals("exit")){
                break;
            } else if (stop.equals("inquiry")) { //계산 조회 로직
                for (int i = 0;i < count; i++) {
                    System.out.println(calList[i].toString());

                }

            }
        }

    }
}
