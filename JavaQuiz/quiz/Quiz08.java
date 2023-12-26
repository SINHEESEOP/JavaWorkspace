package quiz;

import java.util.Arrays;

public class Quiz08 {
    public static void main(String[] args) {

        /*
         절대 중복되지 않는 값을 가지고 있는 길이가 3인 배열 만들기
         1. 랜덤 수 2개를 생성해서, arr 배열을 랜덤하게 10번 섞어줍니다.
         2. 0 ~ 2 번째 인덱스 값을 가지는 새로운 배열로 옮겨 담아보세요.
         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i <= arr.length; i++) {

            int ran = (int) (Math.random() * arr.length);
            int ran2 = (int) (Math.random() * arr.length);

            System.out.println("랜덤 인덱스 : " + ran + " 과 " + ran2);
            int temp = arr[ran];
            arr[ran] = arr[ran2];
            arr[ran2] = temp;
            System.out.println(Arrays.toString(arr));

        }

        int[] arr1 = new int[3];

        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = arr[j];
        }
        System.out.println(Arrays.toString(arr1));


    }
}
