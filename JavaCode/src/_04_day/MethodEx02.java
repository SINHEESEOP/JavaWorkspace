package _04_day;

public class MethodEx02 {

    static int reuslt3 (int a, int b) {
        int sum =  0;
        for (int i = a; i <= b; i++) {
            sum += a;
        }
        return sum;
    }

    static String result4 (int a, int b, String c) {
        String str = "";
        for (int i = a; i <= b; i++) {
            str += c;
        }
        return str;
    }

    public static void main(String[] args) {

        System.out.println(reuslt3(1,10));
        System.out.println(result4(1,3,"c"));

    }
}
