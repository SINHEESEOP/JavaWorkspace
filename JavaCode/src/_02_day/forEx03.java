package _02_day;

import java.util.Arrays;

public class forEx03 {
    public static void main(String[] args) {

        // 1. 배열의 값을 옮기기
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // 근데 배열은 크기가 고정임.

        int[] newArr = new int[5]; // 옮겨담을 새로운 배열

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));

        // 2. 배열의 자리를 바꾸는 방법.
        int x = 10;
        int y = 100;
        int temp = 0;

        temp = y; // temp = y = x = temp;
        y = x;
        x = temp;

        int[] arr2 = {1, 2};

        int temp1 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        // 랜덤하게 3번 자리바꾸기
        int[] arr3 = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 1; i <= 3; i++) {

            int ran = (int) (Math.random() * arr3.length);
            System.out.println("랜덤 인덱스 : " + ran);
            int temp3 = arr3[0];
            arr3[0] = arr3[ran];
            arr3[ran] = temp3;
            System.out.println(Arrays.toString(arr3));
        }
    }
}
