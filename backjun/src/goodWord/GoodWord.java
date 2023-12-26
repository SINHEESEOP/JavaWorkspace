package goodWord;

import java.util.Scanner;

public class GoodWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int call = 1;
        int cnt = 0;

        while (call <= a) {

            String str = sc.next();
            char[] arr = new char[str.length()+4];

            for (int i = 0; i < arr.length-4; i++) {
                arr[i] = str.charAt(i);
            }

            esc:for (int i = 0; i < arr.length; i++) {
                for (int j = i+2 ; j < arr.length; j++) {
                    if (arr[i] != arr[j] && arr[i] == arr[j+1]) {
                        i = j + 1;
                        cnt++;
                        continue esc;
                    }
                }
            }
            call++;
        }
        System.out.println(cnt);
    }
}
