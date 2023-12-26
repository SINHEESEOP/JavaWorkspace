package api.util.arrays;

import java.util.Arrays;

public class ArrayEx {

    public static void main(String[] args) {

        int[] arr = {5,6,7,8,9,1,2,3,4};
        int[] newArr = {5,6,7,8,9,1,2,3,4};


        System.out.println(Arrays.toString(arr));

        double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
        // 배열 전체를 복사
        double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);
        // 세번째 요소까지만 복사
        double[] arCpy2 = Arrays.copyOf(arOrg, 3);
        for(double d : arCpy1) {
            System.out.print(d + "\t");
        }
        // 1부터 4미만 까지 복사.
        double[] arCpy3 = Arrays.copyOfRange(arOrg, 1, 4);
        System.out.println();
        System.out.println(Arrays.toString(arCpy2));
        System.out.println(Arrays.toString(arCpy3));

        // 배열의 탐색
        // 선행조건은 반드시 정렬
        int index = Arrays.binarySearch(arr, 5); // 배열, 찾을값
        System.out.println("5는 " + index + " 번째 위치에 있습니다.");


        // 배열의 비교
        if(Arrays.equals(arr, newArr)) {
            System.out.println("배열의 요소가 같음");
        }

    }

}
