package _02_day;

public class ForEachEx01 {
    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        System.out.println(sum);

        System.out.println("-------------------------------------");

        // 같은거 1
        for (int b: arr) {
            System.out.println(b);
        }

        System.out.println("-------------------------------------");

        // 같은 거 2
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("-------------------------------------");

        String[] arr2 = {"월", "화", "수", "목", "금", "금", "금"};

        for ( String a : arr2 ) {
            System.out.println(a + "요일");
        }

        System.out.println("-------------------------------------");

        //socre의 합계, 평균은 소수점 까지 향상된 포문으로 구해주셈.
        int[] score = {33, 44, 52, 17, 34, 54, 90};
        int sum2 = 0;
        for (double a : score) {
            sum2 += a;
        }
        double aa = sum2 / score.length;
        System.out.println(sum2 + " , " + aa);
    }



}
