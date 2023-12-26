package programers;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;

public class 연습장 {

    public static int solution(long num) {
        int cnt = 0;
        if (num == 1) {
            cnt = 0;
        } else {
            while (true) {
                if (num % 2 == 0) {
                    num = num / 2;
                    cnt++;
                } else {
                    num = num * 3 + 1;
                    cnt++;
                }
                if (num == 1) {
                    break;
                } else if (cnt >= 500) {
                    return -1;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(solution( 626331));

    }
}
