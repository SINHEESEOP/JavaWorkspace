package quiz;

import java.util.Scanner;

public class Quiz11 {
    public static void main(String[] args) {
        /*

        중첩 반복문 - 회전수가 변해야 합니다.
        num 을 입력 받았을때 1부터 num까지 수 중에서 (소수)의 합계 출력.
        소수 - 약수가 1과 자기자신인 수

        num = 10
        2 + 3 + 5 + 7 = 17
        num = 11
        2 + 3 + 5 + 7 + 11 = 28

         */

        // 약수는 5 / 1 == 0

        /*
        10만 반복을 돌리면 10초가 걸리는데 아례 예제)2번을 활용하면 2초만에 나옴
        만약 정수를 받는것이 백만이면, 백만번 반복을 돌텐데 이중 중첩이면?
        제곱번 돈다.. 그렇다면 개느리겠지? 사실상 정수 백만번 부터는 실행이 안된다.
        그럼 어떻게 해야할까?

        2중첩 반복은 n^2 , 하지만 반복문 두개는 2n 이다.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수입력>");
        int set = sc.nextInt();
        int sum = 0;
        abc:for (int i = 1; i <= set; i++) { // (i) 1 ~ 10 숫자중 // set 10
            int get = 0;

            for (int j = 1; j <= i; j++) { // 1 ~ 10 까지 수를 반복
                if (i % j == 0) {
                    get++;
                }
                // 예제2) 약수가 2초과 라는 것은 이미 소수가 아니라는 뜻
                if (get > 2) {
                    continue abc;
                }
            }
            if (get == 2) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
