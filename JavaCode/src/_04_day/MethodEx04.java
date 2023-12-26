package _04_day;

import java.util.Arrays;

public class MethodEx04 {
    static String method6(char[] c) {
        String s = "";
        for (char ch : c) {
            s += "" + ch;
        }
        return s;
    }
    static int method7(int[] a) {
        int sum = 0;
        for (int i: a) {
            sum +=i;
        }
        return sum;
    }
    static String[] method8(String a, String b) {
        String[] str = {a, b};
        return str;
    }
    public static void main(String[] args) {

        // 배열을 매개변수로 전달 가능
        String[] arr = {"월", "화","수"};
        char[] ch = {'a','b','c','d'};
        int[] i = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(method6(ch));
        System.out.println(method7(i));
        System.out.println(Arrays.toString(method8("안","녕")));

    }
}
