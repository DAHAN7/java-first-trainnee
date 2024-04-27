package JAVATEST;
import java.util.Scanner;

public class JAVA8 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 정수 입력 받기
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        // 두 번째 정수 입력 받기
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        // 두 수를 비교하여 큰 수를 찾기
        int max = num1 > num2 ? num1 : num2;

        // 결과 출력
        System.out.println("입력된 두 수 중 큰 수는 " + max + "입니다.");

        // Scanner 닫기
        scanner.close();
    }
}
