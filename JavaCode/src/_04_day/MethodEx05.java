package _04_day;

import java.util.Arrays;

public class MethodEx05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int a = 10;

        System.out.println(arr); // 주소값 (배열이 실제로 만들어진 위치)
        System.out.println(a); // 값
        System.out.println(callByValue(a));
        System.out.println(a);
        callByValue(a);
        callByReference(arr);
        System.out.println(Arrays.toString(arr));
    }
    // 개념적으로 이해
    static int callByValue(int a) {
        a = 100;
        return a;
    }
    static void callByReference(int[] arr) {
        arr[0] = 100;
    }
}
