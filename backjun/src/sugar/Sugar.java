package sugar;

import java.util.Scanner;

public class Sugar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt2 = 0;
        if (num % 3 == 0 || num % 5 == 0) { // 두개로도 딱 못 나누는 경우
            cnt2 = num % 5;
        } else { // 공배수가 아니면 -1 반환
            num = -1;
        }

        int cnt1 = (num - cnt2) / 5;

        int count = 0;
        while (cnt2 == 0) {
            cnt2 -= 3;
            count++;
        }

        int result = cnt1 + count;

        System.out.println(num == -1 ? num : result);
    }
}
