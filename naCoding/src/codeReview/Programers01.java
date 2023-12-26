package codeReview;

import java.util.ArrayList;
import java.util.Arrays;

public class Programers01 {

    public static int[] solution(int[] num_list) {
        int[] answer = {};

        // 마지막 배열의 값을 얻기 위한 활용 변수
        int a = 0;
        int b = 0;
        // 마지막 배열의 조건에 따른 값
        int c = 0;
        // 배열의 마지막 값 구하는 반복문
        for (int i = 0; i < num_list.length; i++) {
            a = num_list[i];
        }
        // 배열의 마지막 값의 전의 값 구하는 반복문
        for (int i = 0; i < num_list.length - 1; i++) {
            b = num_list[i];
        }


        if (a < b) {
            c = a * 2;
        } else if (a > b) {
            c = a - b;
        }

        //answer = new int[]{num_list, c};

        answer = new int[num_list.length + 1];

        // 이제는 기존 num_list + c 한 값을 answer 리스트에 추가하면 됨.

        for (int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[i];
                if (i == num_list.length - 1) {
                    answer[i + 1] = c;
                }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] a = {2,1,6};
        System.out.println(Arrays.toString(solution(a)));

    }
}
