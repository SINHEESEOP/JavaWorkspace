package _03_day;

import java.util.Arrays;

public class ArraySort2 {
    public static void main(String[] args) {

        // 버블정렬 - 큰 값을 뒤로 보낸다.

        int[] arr = {5, 23, 1, 43, 200, 100, 40};

        //바깥 반복문 - 회전수
        //내부 반복문 - 값의 비교를 위한 반복문

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) { // -i 를 넣은 이유는 맨 뒤에 큰 수가 있기 때문
                if (arr[j] > arr[j+1]) { // 동일하게 < , > 바꾸면 내림차순 정렬임
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
//        System.out.println(Arrays.toString(arr));

        // 퀵정렬
        int[] arr2 = {5, 23, 1, 43, 200, 100, 40};
        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));

    }
}
