package _02_day;

public class DoWhileEx01 {
    public static void main(String[] args) {

        // while문으로 1 ~ 10 까지 합계

        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.printf("합계 : %d %n%n", sum);


        // do - while
        int x = 1;
        int sum2 = 0;
        do {
            System.out.println(x);
            sum2 += x;
            x++;
        } while (x <= 10);
        System.out.println("합계 : " + sum2);
    }
}
