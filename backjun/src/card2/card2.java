package card2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class card2 {
    public static void main(String[] args) throws IOException {

        long a = System.currentTimeMillis();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
                list.add(i);
        }
        int index = 0;
        while (true) {

            list.remove(index);
            list.add(list.get(index));
            list.remove(index);
            if (list.size() == 1) {
                break;
            }

        }
        System.out.println(list.toString());

        System.out.println(System.currentTimeMillis() - a);
    }
}
