package JAVATEST;

import java.util.Scanner;

public class JAVA9 {
	public static void main(String[]args) {
		//Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		//변수초기화
		int sum = 0;
		int count = 5;//입력 받을 정수의 개수
		//5개의 정수 입력 받기
		for(int i=1;i<=count; i++) {
			System.out.print("정수를 입력하세요("+i+"/"+count +")");
			int num = scanner.nextInt();
			sum+=num;
		}
		//평균 계산
		int average = sum/ count;
		//결과 출력
		System.out.println("입력된 정수의 합:"+sum);
		System.out.println("입력된 정수들의 평균"+average);

	}

}
