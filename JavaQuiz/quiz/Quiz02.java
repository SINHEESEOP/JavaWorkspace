package quiz;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("신장을 입력하세요 : ");
            double height = sc.nextDouble();
            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt();

            if (height > 300 || age > 150) {
                System.out.println("잘못된 값을 입력했습니다.");
                continue;
            } else if (height >= 140 && age >= 8) {
                System.out.println("놀이기구 탑승 가능합니다.");
            } else {
                System.out.println("탑승 불가능합니다.");
            }
        }


    }
}
