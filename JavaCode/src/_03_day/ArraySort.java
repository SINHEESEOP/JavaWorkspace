package _03_day;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        // 정렬 - 정렬방법은 7가지 정도>?

        // 정렬의 기본 - 선택정렬, 버블정렬
        // 가장 빠른정렬 - 퀵정렬

        // 선택 정렬 - 작은 값을 앞으로 가지고온다.
        int[] arr = {5, 23, 1, 43, 200, 100, 40};

        // 1, 23, 5, 43, 200, 100, 40 - 1회전
        // 1, 5, 23, 43, 200, 100, 40 - 2회전
        // 1, 5, 23, 43, 200, 100, 40 - 3회전
        // 1, 5, 23, 40, 200, 100, 43 - 4회전
        // 1, 5, 23, 40, 43, 200, 100 - 5회전
        // 1, 5, 23, 40, 43, 100 ,200 - 6회전

        // 선생님 방법
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // > 를 < 로 바꿀 경우 내림차 순으로 바꿈.
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
            System.out.println(Arrays.toString(arr));


        }




        // GPT 방법
        int n = arr.length;

        // 모든 요소를 차례로 순회
        for (int i = 0; i < n - 1; i++) {
            // 최소 요소의 인덱스를 찾음
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // 찾은 최소값을 현재 요소와 교환
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }





    }
}
