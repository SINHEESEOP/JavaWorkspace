package _03_day;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        // 복사는 2가지 개념
        // 얕은 복사 - 주소값의 복사
        // 깊은 복사 - 완전히 새로운 배열을 만들고 요소도 옮기는

        int[] arr = {1,2,3,4,5};
        int[] arr2 = arr;

        arr2[0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        int a = 1;
        int b = a;
        a = 2;
        System.out.println(b);

        // 깊은복사
        int[] newArr = new int[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        System.out.println("원본" + Arrays.toString(arr));
        System.out.println("사본" + Arrays.toString(newArr));

        System.out.println("-----------------------------------");

        int[] copy = Arrays.copyOf(arr, arr.length); // 복사할배열, 복사할길이
        System.out.println("사본 : " + Arrays.toString(copy));
    }
}
