package quiz;

import java.util.Arrays;

public class Quiz15 {
    public static void main(String[] args) {

        int[] arr = {100, 200, 300, 400, 500};

        // 배열의 길인은 고정
        int value = 600;

        /*
            배열의 끝에 600의 값을 추가하려고 합니다.
            1. 새로운 배열 + 1을 만든다.
            2. 기존 배열의 값을 옮겨 닮는다.
            3. 마지막에 value를 추가한다.
         */

        // 주의점
        // 1. 배열을 선언 할 때는 길이를 지정
        // 2. 하지만 배열에 값을 넣거나 배열에 값을 뺄때는 항상 인덱스 값을 씀
        // 3. 즉 배열의 길이 -1 임.

        int[] arr2 = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            if (i < arr.length) {
                arr2[arr.length] = value;
                // arr2[arr2.length] = value; // 이렇게 해도 됨
            }
        }
        System.out.println(Arrays.toString(arr2));

        System.out.println("----------------------------");

        // 이번에는 앞에다가 700을 추가하자
        int[] arr3 = {10, 20, 30, 40, 50, 0};

        for (int i = arr3.length - 1; i > 0; i--) {
            arr3[i] = arr3[i - 1];
            if (i > 0) {
                arr3[i - 1] = 700;
            }
        }
        System.out.println(Arrays.toString(arr3));

    }
}
