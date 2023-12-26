package _02_day;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // 1. 배열의 선언
        int[] arr;

        // 2. 배열의 생성
        arr = new int[5];

        // 3.
        System.out.println(arr);

        // 4.
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        // arr[5] = 300; // 배열의 범위를 벗어나면 ArrayIndexOutOfBound 라는 오류가 뜸.

        // 5. 배열의 사용
        System.out.println("배열의 첫번째 값 : " + arr[0]);

        // 6. 배열의 저장된 값을 문자열 보려면
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length); // 배열길이

        // 7. 배열의 선언과 생성을 동시에 하는 문법
        int[] arr2 = new int[3]; // 크기가 3인 정수 배열 생성

        // 8. 배열의 선언과 생성과 초기화(초기 값을 바로 넣어주는) 문법
        // 8-1. 하지만 초기값이 다 있기 때문에 사실상 초기화가 아닌 변경 하는 것.
        // 8-2. 변수나 객체을 초기 값으로 되돌리는 과정은 "재설정(Reset)" 또는 "재초기화(Reinitialization)"라고 표현할 수 있다.
        byte[] arr3 = new byte[] {1,2,3,4,5};
        byte[] arr4 = {1,2,3,4,5};

        System.out.println(Arrays.toString(arr3));

        // 9. 배열은 초기값을 지정하지 않으면 자동으로 기본값 지정이 들어갑니다.
        // 정수는 0, 실수는 0.0, 논리는 false, 문자열은 null
        System.out.println(Arrays.toString(arr2));

        // 크기가 3인 문자열을 저장하는 배열을 만들고, 월요일, 화요일, 수요일 로 초기화
        // "오늘은 수요일 입니다"
        String a[] = {"월요일", "화요일", "수요일"};
        System.out.println(Arrays.toString(a));
        System.out.println("오늘은 " + a[2] + " 입니다.");

        byte[] arr7 = new byte[] {1,2,3,4,5};


    }
}
