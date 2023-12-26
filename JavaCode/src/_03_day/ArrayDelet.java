package _03_day;

import java.util.Arrays;

public class ArrayDelet {
    public static void main(String[] args) {


        // 배열은 값의 삭제라는 개념이 없다.
        // 중간 값을 삭제하면 구멍이 뻥뻥 뚫리는 모양일텐데 말 안되죠?

        // 그렇다면 마치 삭제되는 것처럼 처리한다.
        // How?
        // 1. 삭제할 위치 다음 값부터 마지막 까지 배열을 당김
        // 2. 크기가 원본-1 인 새로운 배열에 옮겨 담으면 된다.

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] newArr = new int[arr.length-1];
        int index = 5; // 삭제할 인덱스 (가정)

        for (int i = index - 1; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));

    }
}
