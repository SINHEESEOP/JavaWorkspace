package _04_day;

import java.util.Scanner;

public class MethodEx03 {

    static void print() {
        System.out.println("두 정수를 입력하세요!");
    }

    static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print(">");
        return sc.nextInt();
    }

    static int add(int a, int b) {
        return a + b;
    }

    static void result(int result) {
        System.out.println("두 수의 합 : " + result);
    }

    public static void main(String[] args) {

        print();
//        int a = input();
//        int b = input();
        int sum = add(input(), input());
        result(sum);
    }
}
