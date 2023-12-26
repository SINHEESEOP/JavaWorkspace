package programers;

import java.util.Arrays;

public class 문자열_쪼개기_방법2개 {
    public static void main(String[] args) {

        // toCharArray 를 사용하여 문자열 쪼개기.

        String input = "3x + 4 + x";

        // 문자열을 문자 배열로 변환
        char[] charArray = input.toCharArray();

        // 문자 배열을 반복하여 각 문자 출력
        for (char c : charArray) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println(Arrays.toString(charArray));

        System.out.println("==================================");

        // split 매소드 사용하여 문자열 쪼개기.

        String input1 = "3x + 4 + x";

        // 문자열을 공백을 기준으로 분할
        String[] parts = input.split(" ");

        // 분할된 부분을 출력
        for (String part : parts) {
            System.out.print(part);

        }
        System.out.println();
        System.out.println(Arrays.toString(parts));

        String[] s  = {"a","b"};
        System.out.println(Arrays.toString(s));
    }
}