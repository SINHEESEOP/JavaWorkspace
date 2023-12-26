package searchForDocuments;

import java.util.Arrays;
import java.util.Scanner;

public class SearchForDocuments {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        String str = a.replace(b, "1");
        String[] arr = str.split("");

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("1")) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
