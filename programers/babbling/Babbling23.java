package programers.babbling;

import java.util.Arrays;

public class Babbling23 {
    static int solution(String[] babbling) {
        int cnt = 0;
        String bab1 = String.join(" ", babbling);
        bab1 = bab1.replaceAll("aya|ye|woo|ma", "1");
        System.out.println(bab1);
        String[] bab = bab1.split(" ");
        for (int i = 0; i < bab.length; i++) {
            if(containsOnlyOnes(bab[i])) {
                cnt++;
            }
        }
        return cnt;
    }
    static boolean containsOnlyOnes(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(solution(babbling));
    }
}
