package quiz;

public class Quiz17 {

    static void method1() {
        System.out.println("안녕");
    }

    static String method2(String str) {
        return str;
    }

    static double method3(int a, int b, double d) {
        return a + b + d;
    }

    static String method4(int a) {
        if (a % 2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }
    }

    static void method5(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

    static int maxNum(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    static int abs(int a) {
        if (0 <= a) return a;
        else return a * -1;
    }

    public static void main(String[] args) {
        method1();
        System.out.println(method2("안녕하세요"));
        System.out.println(method3(1,1,1.5));
        System.out.println(method4(4));
        method5("c", 5);
        System.out.println(maxNum(-2,-3));
        System.out.println(abs(-5));
    }
}
