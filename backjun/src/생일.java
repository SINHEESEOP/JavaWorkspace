package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 생일 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        int a = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < a; i++) {
            list.add(sc.nextLine());
        }
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i));
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).replaceAll("[^0-9]", " "));
            list.set(i, list.get(i).trim());
            list.set(i, list.get(i).replace(" ", "-"));
        }



        System.out.println(list.toString());

        System.out.println(list.toString());

    }
}
