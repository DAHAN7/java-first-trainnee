package JAVATEST;

public class JAVA11 {
    public static void main(String[] args) {
        // 구구단 역순 출력
        for (int i = 9; i >= 1; i--) {
            for (int j = 9; j >= 1; j--) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println(); // 한 행 출력 후 줄 바꿈
        }
    }
}
