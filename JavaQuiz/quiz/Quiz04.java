package quiz;

import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        int count = sc.nextInt();


        int i = 1;
        while (i <= count) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            money -= a*b;

            i++;
        }

        if (money == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
