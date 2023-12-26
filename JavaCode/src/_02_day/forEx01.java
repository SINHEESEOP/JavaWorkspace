package _02_day;

public class forEx01 {
    public static void main(String[] args) {

        // for 문 가운데 식이 true 가 되야 반복을 시작하며, false 가 되면 멈춤

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println(sum);
        }

        System.out.println("--------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(10 - i);
        }

        System.out.println("--------------------");

        for (int i = 10; 1 >= -i; i++) { // 무한 반복문
            System.out.println(i);
        }

    }
}
