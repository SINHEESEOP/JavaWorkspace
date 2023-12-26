package _04_day;

import java.util.Arrays;

public class StringHandling {
    public static void main(String[] args) {
        // 문자열 다루기 메소드

        // 문자열 "ABC";
        String str = "ABC";
        char[] arr = {'A','B','C'};

        String str2 = new String(arr);

        System.out.println(str);
        System.out.println(str2);
        //문자열은 인덱스가 존재함 시작은 0

        //문자열 다루기 메소드 - 문자열.메소드명()
//        1. 문자열 길이 확인 .length
        str.length(); // 메소드 사용시 반환 값을 잘보자.
//        2. 문자열을 문자로 반환 .charAt();
        char a = str.charAt(1);
        System.out.println(a);
//        3. 인덱스 기준으로 자르기 substring()
        System.out.println(str.substring(0,2));
//        4. 해당 문자 기준으로 자르기 split()
        str = "010-1234-5678";
        System.out.println(Arrays.toString(str.split("-")));
        char[] e = str.toCharArray();
        System.out.println(e);
//        .replaceFirst
    }
}
