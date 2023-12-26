package programers.nationalContestSelectionTest;

import java.util.Arrays;

public class HeeSeop {
    static int solution(int[] rank, boolean[] attendance) {
        int cnt = 0;
        int a = 0;
        int b = 0;
        int c= 0;

        int newArr[] = new int[attendance.length];

        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                cnt++;
                newArr[i] = rank[i];
            }
        }
        int j = 0;
        int newArr2[] = new int[cnt];
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] != 0) {
                newArr2[j] = newArr[i];
                j++;
            }
        }

        Arrays.sort(newArr2);

        for (int i = 0; i < rank.length; i++) {
            if (newArr2[0] == rank[i]) {
                a = i;
            }
        }
        for (int i = 0; i < rank.length; i++) {
            if (newArr2[1] == rank[i]) {
                b = i;
            }
        }
        for (int i = 0; i < rank.length; i++) {
            if (newArr2[2] == rank[i]) {
                c = i;
            }
        }

        return 10000 * a + 100 * b + c;
    }

    public static void main(String[] args) {
        int[] i = {3, 7, 2, 5, 4, 6, 1};
        boolean[] bool = {false, true, true, true, true, false, false};
        System.out.println(solution(i, bool));
    }
}
