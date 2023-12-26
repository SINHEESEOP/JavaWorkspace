package ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ATM {


    public static void main(String[] args) throws IOException {

//         1번 = 3, 2번 = 1, 3번 = 4, 4번 = 3, 5번 = 2
//        1,2,3,3,4
//        1 + 3 + 6 + 9 + 13
//      즉 가장 빨리 끝내는 놈 순서로 정렬해서 더하면 된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<Integer> list = new ArrayList<Integer>();

        Integer a = Integer.parseInt(br.readLine());
        String[] b = br.readLine().split(" ");


        for (int i = 0; i < b.length; i++) {
            list.add(Integer.parseInt(b[i]));
        }

        Collections.sort(list);

        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < list.size(); i++) {
            sum2 += list.get(i);
            sum += sum2;
        }
        System.out.println(sum);
    }
}