package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] list = new int[a];

        for (int i = 0; i < a; i++) {
            int input = sc.nextInt();
            list[i] = input;
        }

        System.out.println(Arrays.toString(list));
        int max = list[0];
        for (int i : list) {
            if (max < i) {
                max = i;
            }
        }
        int min = list[0];
        int to = 0;
        for (int i : list) {
            if (min > i) {
                min = i;
            }
        }

        System.out.println(min);
        System.out.println(max);

//        for (int i = 0; i < a; i++) {
//            int random = (int) (Math.random() * 201) - 100;
//            if (random < 1000000 && random >= -1000000);
//            list[i] = random;
//        }

    }
}
