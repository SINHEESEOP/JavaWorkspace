package continuingTheNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContinuingTheNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int a = sc.nextInt();

        int max = 0;
        int i = 1;
        int index = 0;
        int iMax = 0;
        while (i <= a) {

            list.add(a);
            list.add(i);

            while (true) {
                if (list.get(list.size() - 2) - list.get(list.size() - 1) < 0) {
                    break;
                }
                list.add(list.get(index) - list.get(index + 1));
                index++;
            }

            if (max < list.size()) {
                max = list.size();
                iMax = i;
            }

            list.clear();
            index = 0;
            i++;

        }

        list.add(a);
        list.add(iMax);

        while (true) {
            if (list.get(list.size() - 2) - list.get(list.size() - 1) < 0) {
                break;
            }
            list.add(list.get(index) - list.get(index + 1));
            index++;
        }


        System.out.println(list.size());
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }

    }


}
