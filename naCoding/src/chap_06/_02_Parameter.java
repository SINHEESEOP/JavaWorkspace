package chap_06;

public class _02_Parameter {

    public static int powerExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        // System.out.printf("%d의 %d승은 %d입니다.\n", number, exponent, result);
        return result;
    }


    public static void power(int number) { // Parameter, 매개변수
         int result = number * number;
         System.out.printf("%d의 제곱은 %d입니다.%n", number, result);;
    }
    public static void main(String[] args) {

        System.out.println(powerExp(2,1));
        int a = powerExp(2,1);
        power(2);
        int b = powerExp(2,1);
        System.out.println(a == b);
        System.out.println(powerExp(2,1) == powerExp(2,1));

    }
}
