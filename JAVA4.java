package JAVATEST;

public class JAVA4 {
	public static void main(String[]args) {
		int oddsum = 0;
		for(int i =1; i<=100; i++) {
			if(i%2 !=0) {
				oddsum +=i;
			}
		}
		System.out.println("1부터 100까지의 홀수의 합:"+oddsum);
	}

}
