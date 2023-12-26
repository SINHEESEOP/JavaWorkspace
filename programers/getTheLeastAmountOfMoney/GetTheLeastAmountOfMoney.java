package programers.getTheLeastAmountOfMoney;

import java.util.Arrays;

public class GetTheLeastAmountOfMoney {

    public static int solution(int[] array) {
        int answer = 0;
        int[] arr = new int[array.length];

        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[0] == array[i]) {
                cnt++;
            }
        }
        if (cnt == array.length) return array[0];

        for (int a : array) {
            arr[a] += 1;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    answer = i - 1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (answer + 1 == arr[i]) {
                cnt2++;
            }
        }

        if (cnt2 >= 2) return -1;

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,5,5};
        System.out.println(solution(arr));
    }
}
