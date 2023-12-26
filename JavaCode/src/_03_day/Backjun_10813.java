package _03_day;

import javax.management.MBeanAttributeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class Backjun_10813 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int baguni = sc.nextInt();
        int roop = sc.nextInt();

        int[] arr = new int[baguni];

        for (int i = 1; i <= baguni; i++) {
            arr[i - 1] = i;
        }

        for (int i = 1; i <= roop; i++) {

            int change = sc.nextInt() - 1;
            int change2 = sc.nextInt() - 1;

            int temp = arr[change];
            arr[change] = arr[change2];
            arr[change2] = temp;
        }

        // 해당 방식으로 출력 시 마지막 출력 뒤에 공백이 붙음.
        // 안붙게 나오게 해야 더 정답에 가까움, 백준은 출력값 따박따박 맞춰야함

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        // 백준에 맞는 정확한 출력 값

        //예1)
        String str = "";
        for(int i = 0; i < arr.length; i++) {
            str += arr[i];
            if(i == arr.length - 1) break;
            str += " ";
        }
        System.out.println(str);



        // 예)2
        System.out.println();
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i - 1] + " " + arr[4]);
        }

    }
}
