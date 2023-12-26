package _01_day;

public class VariableScope {
    public static void main(String[] args) {

        int num1 = 10, num2 = 20, num4 = 100; // 같은 타입 변수는 나열이 가능
        if (true) {
            int num3 = num1 + num2;
            System.out.println(num3);

            num4 = 1000;
        }
        // System.out.println(num3);
        System.out.println(num4);


    }
}
