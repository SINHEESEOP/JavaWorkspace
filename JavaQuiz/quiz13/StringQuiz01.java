package quiz13;

import java.util.Scanner;

public class StringQuiz01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String id = "";

        while (true) {
            id = sc.nextLine();
            id = id.trim();
            id = id.replace(" ", "");

            if (id.length() >= 5) {
                break;
            }
        }
        System.out.println(id);
    }

}
