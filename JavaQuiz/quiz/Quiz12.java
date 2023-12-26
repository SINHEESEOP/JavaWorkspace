package quiz;

import java.util.Scanner;

public class Quiz12 {
    public static void main(String[] args) {
        //updown 게임
        // 1 ~ 100 까지 임의의 랜덤한 정수가 결정되고, 정답을 맞추는 프로그램

        int a = (int) (Math.random() * 100) + 1;
        System.out.println(a);

        Scanner sc = new Scanner(System.in);

        int cnt = 1;
        while (true) {
            System.out.println("정수를 입력하세여");
            int c = sc.nextInt();
            cnt++;
            System.out.println("현재 시도 횟수 " + cnt);
            if (a == c) {
                System.out.println("정답입니다.");
                System.out.println(cnt + " 만에 성공했습니다,");
                break;
            }

            if (a < c) {
                System.out.println("더 작은 수를 입력하세요.");
            }

            if (a > c) {
                System.out.println("더 큰 수를 입력하세요.");

            }
        }
    }
}
