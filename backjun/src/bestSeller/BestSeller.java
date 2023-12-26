package bestSeller;


import java.util.*;

public class BestSeller {


    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        List<String> strList2 = new ArrayList<>();
        List<Integer> intList = new ArrayList<>();
        List<Integer> intList2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 1;
        int[] arr = new int[10000];
        String[] strArr= new String[10000];
        while (b <= a) {

            String str = sc.next();
            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                int index = str.charAt(i);
                sum += index;
            }

            arr[sum - 1] += 1;
            strArr[sum - 1] = str;
            b++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                intList.add(arr[i]);
            }
            if (strArr[i] != null) {
                strList.add(strArr[i]);
            }
        }

        int max = intList.get(0);
        int cnt = 0;
        for (int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > max) {
                intList2.add(intList.get(i));
                strList2.add(strList.get(i));
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println(intList.get(0));
        } else {
            Collections.sort(strList2);
            System.out.println(strList2.get(0));
        }
    }
}
