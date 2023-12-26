package _04_day_DataStructure;

public class Queue {
    public static void main(String[] args) {
        // Queue - FIFO (First in First Out)`
        // 단순 예시이며 더 추가적인 기능이 많다.
    }

    static int[] arr = {};

    // 추가
    static void push(int data) {
                /*
            1. 배열의 크기를 +1 시킴
            2. 배열의 요소를 1번에 옮겨 담는다.
            3. 마지막에 추가.
            4. 원본 배열을 새로운 배열로 변경.
            4-1.
         */
        // 1.
        int[] temp = new int[arr.length + 1];
        // 2.
        for (int i = 0; i < arr.length; i++) temp[i] = arr[i];
        // 3.
        temp[temp.length - 1] = data;
        // 4.
        arr = temp;
        temp = null; // temp 삭제.

    }

    // 삭제
    static int pop() {
        /*
            1. 삭제할 데이터 백업
            2. arr - 1 사본 배열 생성
            3. 값을 한칸씩 당겨 옮긴다.
            4. 원본 배열을 사본 배열로 바꿈
            5. 1번(del) 값을 리턴
         */
        if (arr.length > 0) { // 값이 하나라도 있어야 삭제를 가능하니까.
            // 1.
            int del = arr[0];
            // 2.
            int[] temp = new int[arr.length - 1];
            // 3. 방법 2가지가 있다.
//            for (int i = 1; i <= temp.length; i++) temp[i - 1] = arr[i];
            for (int i = 0; i < temp.length; i++) temp[i] = arr[i+1];
            // 4.
            arr = temp;
            temp = null;
            // 5.
            return del;
        }
        return 0; // 값이 아예 없다면 0을 리턴 해줌
    }
}
