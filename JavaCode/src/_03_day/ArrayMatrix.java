package _03_day;

import java.util.Arrays;

public class ArrayMatrix {
    public static void main(String[] args) {

        // 자바로 개발할 때는 생각보다 차원 배열은 거의 쓰지 않는다.
        // 2차원 배열 - 배열안에 배열이 들어간다.

        // 이차원 배열을 만드는 방법1
        int[][] arr = {{1, 2, 3,}, {4, 5, 6,}, {7, 8, 9}};

        //이차원 배열을 만드는 방법2
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};
        int[][] arr0 = {arr1, arr2, arr3};


        // 인덱스 접근
        System.out.println(arr[0]); // 배열 주소
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));

        // 이건 안됨
//        System.out.println(Arrays.toString(arr[1][1]));
//        System.out.println(Arrays.toString(arr[1][2]));

        // 1행 1열이 보고싶다?
        System.out.println(arr[1][1]);

        System.out.println("------------------------------");

        // 가로(행)
        for (int i = 0; i < arr.length; i++) {

            // 세로 (열)
            for (int j = 0; j < arr[i].length; j++) {

                System.out.println(arr[i][j]);
            }
        }



        System.out.println("=================================");



        // 2차원 배열을 만드는 두번째 방법.
        int[][] ar = new int[3][4]; //행렬
        int a = 1;
        // ar 2차원 배열에 1 ~ 12 까지 값을 순서대로 저장
        // 4개씩 쪼개서 값을 저장
        for (int i = 0; i < ar.length; i++) {

            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = a++; // 주의!! ++a 로 할 시 반대로 2부터 들어감
                // 59번 줄 = 값에 a 를 넣고 60번 아래 줄에서 a++; 를 해도 되며, ++a로 써도됨.
                // ++연산은 단항으로 사용시 a++ = ++a 과 같음
            }
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
        }



    }
}
