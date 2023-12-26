package programers.jadenCaseMake;

import java.util.Arrays;
import java.util.StringTokenizer;

public class JadenCaseMake {

    public static String solution(String s) {
        String answer = "";
        String a = s.toLowerCase();
        String[] arr = a.split("");

        arr[0] = arr[0].toUpperCase();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(" ")) {
                arr[i + 1] = arr[i + 1].toUpperCase();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }

    // 65 ~ 122
    public static void main(String[] args) {
        System.out.println(solution("     for  the what 1what    "));
//            answer += " " + Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);

    }
}
