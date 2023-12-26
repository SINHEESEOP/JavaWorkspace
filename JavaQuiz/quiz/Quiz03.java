package quiz;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a.equals(b) ? "같은 수 입니다." : "다른 수 입니다.");


    }
}
