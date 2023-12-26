package programers.pickTwoAndAddThem;

import java.util.Arrays;

public class PickTwoAndAddThem02 {


    public static int[] solution(int[] numbers) {// 배열에 0만 있을경우 0출력
        int tt = 0;
        int[] arrr = {0};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                tt++;
            }
        }
        if (tt == numbers.length) {
            return arrr;
        }
        long[] answer = new long[numbers.length * numbers.length];
        Arrays.sort(numbers);
        int t = 0;
        for (int i = numbers[0] + numbers[1]; i <= numbers[numbers.length - 1] + numbers[numbers.length - 2]; i++) {

            for (int j = 0; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (i == numbers[j] + numbers[k]) {
                        answer[t] = i;
                        t++;
                        break;
                    }
                }
            }
        }
        int a = 0;
        for (int i = 0; i < answer.length; i++) {
            if (numbers[numbers.length - 1] + numbers[numbers.length - 2] == answer[i]) {
                a = i;
            }
        }
        int[] arr = new int[a + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) answer[i];
        }
        return arr;
    }


    public static void main(String[] args) {
            int[] arr = {2,1,3,4,1};
            System.out.println(Arrays.toString(solution(arr)));
    }
}