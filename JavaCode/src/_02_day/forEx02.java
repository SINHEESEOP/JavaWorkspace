package _02_day;

public class forEx02 {
    public static void main(String[] args) {

        // 랜덤한 정수가 소수인지 판별 for
        // 소수 = 약수가 1과 자기자신인 수
        int ran = (int) (Math.random() * 100) + 1;

        int cnt = 0;
        for (int i = 1; i <= ran; i++) {
            if (ran % i == 0) {
                cnt++;
            }
        }

        System.out.println(cnt == 2 ? "소수입니다" : "소수가 아닙니다.");


        /*

         1. ran 수까지 회전을 한다.
         2. 약수의 개수를 센다.
         3. for 문 밖에서 개수 확인한다.

         */

    }
}
