 	package JAVATEST;

import java.util.Scanner;
 
public class JAVA12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRun = true;
        int money = 0;
        while (isRun) {
            System.out.println("======================");
            System.out.println("1.예금|2.출금|3.잔액확인|4.종료");
            System.out.println("======================");
            System.out.print("번호를 입력해 주세요(1~4)> ");
            int selectNo = sc.nextInt();
            switch (selectNo) {
                case 1:
                    System.out.print("예금할 금액을 입력하세요: ");
                    int deposit = sc.nextInt();
                    money += deposit;
                    System.out.println(deposit + "원이 예금되었습니다.");
                    break;
                case 2:
                    System.out.print("출금할 금액을 입력하세요: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > money) {
                        System.out.println("출금 금액이 예금액을 초과합니다.");
                    } else {
                        money -= withdraw;
                        System.out.println(withdraw + "원이 출금되었습니다.");
                    }
                    break;
                case 3:
                    System.out.println("잔액은 " + money + "원 입니다.");
                    break;
                case 4:
                    isRun = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 1부터 4 사이의 숫자를 입력하세요.");
            }
        }
        sc.close();
        System.out.println("Main 종료");
    }
}
