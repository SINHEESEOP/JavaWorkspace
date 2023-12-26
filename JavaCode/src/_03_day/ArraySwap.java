package _03_day;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {

        // 배열의 값을 서로 바꾸는 작업

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        // 랜덤하게 2개의 인덱스를 생성
        int i = (int) (Math.random() * arr.length);
        int j = (int) (Math.random() * arr.length);

        System.out.println(i + " - " +j);

        // 자리 바꾸기
        int temp = i;
        i = j;
        j = temp;
        System.out.println("자리 바꾸기!");
        System.out.println(i + " - " +j);

        int[] arr2 = {};
        

    }
}
