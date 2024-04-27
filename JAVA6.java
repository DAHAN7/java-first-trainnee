package JAVATEST;

import java.util.Scanner;

public class JAVA6 {
	public static void main(String[] args) {
	//Scanner 객체 생성
	Scanner scanner = new Scanner(System.in);
	//사원명 입력받기
	System.out.print("사원명을 입력하세요");
	String employeeName = scanner.nextLine();
	//시급 입력 받기
	System.out.print("시급을 입력하세요:");
	int hourlyWage = scanner.nextInt();
	//근무시간 입력받기
	System.out.print("근무 시간을 입력하세요:");
	int workingHours = scanner.nextInt();
	//급여금액 계산
	int salary = hourlyWage * workingHours;
	//공제합계 계산
	double deduction = salary * 0.03;
	//실지급액 계산
	double netPay = salary - deduction;
	//급여 명세서 출력
	System.out.println("====급여명세서====");
	System.out.println("사원명"+employeeName);
	System.out.println("시급:"+hourlyWage +"원");
	System.out.println("근무 시간:"+workingHours+"시간");
	System.out.println("급여금액:"+salary+"원");
	System.out.println("공제합계:"+(int)deduction+"원");
	System.out.println("실지급액:"+(int)netPay+"원");
	
	}
}
