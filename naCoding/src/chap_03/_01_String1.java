package chap_03;

import java.sql.SQLOutput;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "i like Java and Python and c.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함된다면 true / 포함되지 않는다면 false
        System.out.println(s.contains("C#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // 위치 정보 7
        System.out.println(s.indexOf("C#")); // 포함되지 않으면 -1 (false)
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치정보 (12)
        System.out.println(s.lastIndexOf("and")); // 마지막으로 일치하는 위치정보 (23)
        System.out.println(s.startsWith("i li")); //  이 문자열로 시작하면 true (아니면 false)
        System.out.println(s.endsWith("c.")); // 이 문자열로 끝나면 true

        System.out.println("\n");
        System.out.println(s.toUpperCase().contains("JAVA"));
    }
}
