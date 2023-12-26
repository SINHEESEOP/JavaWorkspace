package card2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        int index = 0;


        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                list.add(i);
                list.add(i);
                list.remove(0);
            }
        }

        System.out.println(list.get(list.size()-1));
    }
}
