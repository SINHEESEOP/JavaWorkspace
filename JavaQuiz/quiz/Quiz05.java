package quiz;

import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 자판기
        // 동전
        int a = sc.nextInt();
        int[] arr = {1000, 500, 100, 50, 10};
        // 잔돈
        int money = a; // 1000원 17, 500원 1개, 100원 2개, 50원 1개, 10원 3개

        int[] t = new int[arr.length]; // t = 5, i = 4, arr = 5

        int i = 0;

//        // 방법1 (명인이 형)
//        while (i < arr.length) {
//            if (money == 0) {
//                break;
//            }
//            t[i] = money / arr[i];
//            System.out.printf("%d원짜리 %d개", arr[i], t[i]);
//            money -= t[i] * arr[i];
//            i++;
//        }

        // 방법2 (선생님)
        while (i < arr.length){

            System.out.println(arr[i] + "원 " + money / arr[i] + "개");
            money %= arr[i];
            i++;
        }


    }
}
