package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 바이러스 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        String a = sc.next();
        int b = sc.nextInt();

        String[][] arr = new String[b][2];
        String str = "";
        for (int i = 0; i < b + 1; i++) {
            str += sc.nextLine() + " ";
        }
        String[] arr2 = str.split(" ");

        for (int i = 0; i < arr2.length; i++) {
            list.add(arr2[i]);
        }
        list.remove(0);

        int index = 0;
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = list.get(index);
                index++;
            }
        }

        int ii = 1;
        while (ii <= 2) {

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j].equals("1")) {
                        if (j == 1) {
                            arr[i][j - 1] = "1";
                        } else {
                            arr[i][j + 1] = "1";
                        }
                    }
                }
            }
            ii++;
        }

        System.out.println(str);
        System.out.println(list.toString());
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr[1]));
    }
}
