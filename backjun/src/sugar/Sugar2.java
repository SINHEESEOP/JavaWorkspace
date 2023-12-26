package sugar;

import java.util.Scanner;

public class Sugar2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num2 = num;
        int answer = 0;
        int cnt = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        while (true) {
            if (num < 5) {
                break;
            }
            if (num == 5) {
                num -= 5;
                cnt++;
                answer = cnt;
                break;
            }
            num -= 5;
            cnt++;
        }

        while (true) {
            if (num2 % 5 == 0) break;
            if (num < 3) {
                if (num2 % 3 != 0) {
                    answer = -1;
                    break;
                } else {
                    answer = num2 / 3;
                    break;
                }
            }
            if (num == 3) {
                num -= 3;
                cnt2++;
                answer = cnt + cnt2;
                break;
            }
            num -= 3;
            cnt2++;
        }


        System.out.println(answer);

    }
}
