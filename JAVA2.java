package JAVATEST;
import java.util.Scanner;

public class JAVA2 {
	 public static void main(String[] args) {
	double radius;
	double area;
	Scanner scanner = new Scanner(System.in);
	System.out.print("반지름을 입력하세요:");
	radius = scanner.nextDouble();
	area = radius * radius * Math.PI; // 원주율은 Math 클래스의 PI 상수를 이용
    
	System.out.printf("원의 면적:%.1f",+area);
}
}