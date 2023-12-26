package codeReview;

import java.util.Arrays;

public class Programers02 {
    static int[] Solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length + 1];

//        int c = 0;
//        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
//           c = num_list[num_list.length - 1] - num_list[num_list.length - 2];
//        } else if (num_list[num_list.length - 1] <= num_list[num_list.length - 2]) {
//            c = num_list[num_list.length - 1] * 2;
//        }

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
            if (i == num_list.length - 1) {
                answer[i + 1] = num_list[num_list.length-1] > num_list[num_list.length-2] ?
                        num_list[num_list.length-1]-num_list[num_list.length-2]:num_list[num_list.length-1]*2;
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        int[] a = {2,1,6};
        System.out.println(Arrays.toString(Solution(a)));

    }
}

