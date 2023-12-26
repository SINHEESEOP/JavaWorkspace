import java.util.Scanner;

public class Backjun_10818 {
    public static void main(String[] args) {

        // 내가 푼 방식

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] list = new int[a];

        for (int i = 0; i < a; i++) {
            int input = sc.nextInt();
            list[i] = input;
        }

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
    }
}

