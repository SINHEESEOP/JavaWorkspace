package quiz;

import java.util.Scanner;

public class Quiz13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*

        랜덤한 문제 내고, 정답 맞추기
        */

        while (true) {
            int a = (int) (Math.random() * 100) + 1;
            int b = (int) (Math.random() * 100) + 1;

            System.out.println("문제를 그만 푸시려면 0을 입력하세요.");
            System.out.print(a + " + " + b + " = ");

            int c = sc.nextInt();

            if (c == 0) {
                System.out.println("종료합니다.");
                break;
            }

            if (a + b == c) {
                System.out.println("정답입니다.");
                break;

            }
            if (a + b != c) System.out.println("틀렸음");
        }
        System.out.println("프로그램 정상 종료");




    }
}
