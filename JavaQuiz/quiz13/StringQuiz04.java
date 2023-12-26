package quiz13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringQuiz04 {

    public static boolean palinderomeCheck(String str) {
        boolean bool = true;

        String a = "";
        int index = str.length() - 1;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(index - i)) {
                return false;
            }
        }
        return bool;
    }

    public static void main(String[] args) {
        System.out.println(palinderomeCheck("아시마시아"));
    }

}
