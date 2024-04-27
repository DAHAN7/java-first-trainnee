package JAVATEST;

public class JAVA3 {
	

	public static void main(String[] arg){
	int oddsum	= 0;
	 for (int i = 1; i <= 10; i++) { // 1부터 10까지 반복
		  oddsum += i; // 현재 숫자를 합계에 더함
		System.out.print(i);
		if (i < 9) {
            System.out.print(" + "); // 마지막 숫자가 아니면 "+" 출력
        } else {
            System.out.print(" = "); // 마지막 숫자면 "=" 출력
        }
    }
    // 전체 합계 출력
    System.out.println(oddsum);
}
}