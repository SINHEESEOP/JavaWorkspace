package _02_day;

import java.util.Arrays;
import java.util.Scanner;

public class WhileEx04 {
    public static void main(String[] args) {

        //int[] arr = new int[5];
        int[] arr = {1,2,3,4,5,6,7,8,9,10}; // 배열의 길이는 항상 마지막 인덱스보다 1 크다.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] list = new int[a];
        int i = 0;

        while (i < a) {
            list[i] = i + 1;
            i++;
        }
        System.out.println(Arrays.toString(list));
    }
}
