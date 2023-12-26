package _04_day_DataStructure;

import java.util.Arrays;

public class Stack {
    public static void main(String[] args) {

        // 배열의 한계점 -> 크기가 고정.
        // stack - LIFO (Last in first out) = 마지막에 들어간 것은 먼저 나온다.
        // 상자에 수직으로 접시를 쌓는 경우, 마지막에 넣은 접시 먼저 꺼내야 한다.
        // 변수가 저장되는 공간 stack 이다. 자료구조? = 데이터 저장방식. 예1) 참조

        // push - 값을 마지막에 하나 추가. 예2) 참조
        // pop - 값을 마지막에서 하나 제거 하고 반환. 예3) 참조

        // 예시 1.
        int a = 1;
        if (true) {
            int b = 2;
        }
        // 먼저 만들어진 a, 이후 b, 이후 지워지는 것은 b, a 이다.
        push(10);
        push(20);
        push(30);
        System.out.println(Arrays.toString(arr));
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(Arrays.toString(arr));
    }

    // 예시 자료.
    static int[] arr = {1, 2, 3, 4, 5};

    // 추가
    static void push(int data) {
        /*
            1. 배열의 크기를 +1 시킴
            2. 배열의 요소를 1번에 옮겨 담는다.
            3. 마지막에 추가.
            4. 원본 배열을 새로운 배열로 변경.
         */
        // 1.
        int[] temp = new int[arr.length + 1];
        // 2.
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        // 3.
        temp[temp.length - 1] = data;
        // 4.
        arr = temp;
        temp = null; // temp 삭제.

    }

    // 제거
    static int pop() {
        if (arr.length > 0) {
            // 1. 삭제할 값부터 백업
            int del = arr[arr.length - 1];
            // 2. 원본 배열의 크기 -1인 새로운 배열을 생성
            int[] temp = new int[arr.length - 1];
            // 3. 값을 옮겨 담는다.
            for (int i = 0; i < temp.length; i++) temp[i] = arr[i];
            // 4. 원본 배열을 사본 배열로 바꿈
            arr = temp;
            temp = null;
            // 5. 1번을 리턴
            return del;
        }
        return 0;
    }
}