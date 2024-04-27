package JAVATEST;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class JAVA10 {
	public static void main(String[]args) {
		//Scanner 객체생성
		Scanner scanner = new Scanner(System.in);
		//사용자에게 정수 값 입력 받기
		int score = -1;//초기값 설정
		while(score<0 || score >100) {
			//입력된 값이 0에서 100 사이가 아니면 반복
			System.out.println("정수 값을 입력하세요(0에서 100사이):");
			score = scanner.nextInt();
			if(score<0|| score>100) {
				System.out.println("잘못된 입력입니다.0에서 100사이의 정수를 입력하세요.");
			}
		}
		//학점 확인
		char grade;
		if(score>=90){
			grade = 'A';
		}else if(score >=80) {
			grade = 'B';
	}else if(score >=70) {
		grade ='c';
	}else if (score >=60) {
		grade = 'D';
	}else {
		grade ='F';
	}
		//결과 출력
		System.out.println("입력된 정수에 해당하는 학점은"+grade+"입니다.");
	}
}
