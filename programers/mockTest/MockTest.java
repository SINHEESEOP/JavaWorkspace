package programers.mockTest;

import java.util.Arrays;

public class MockTest {

    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] ang = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] one = new int[answers.length];
        int[] two = new int[answers.length];
        int[] three = new int[answers.length];

        int kkk = 1;
        for (int i = 0; i < answers.length; i++) {
            one[i] = kkk;
            kkk++;
            if (kkk == 6) {
                kkk = 1;
            }
        }

        int kkk1 = 1;
        for (int i = 0; i < answers.length; i++) {
            two[i] = 0;
            if (i % 2 == 0) {
                two[i] = 2;
            }
            if (i % 2 != 0) {
                two[i] = kkk1;
                kkk1++;
                if (kkk1 == 2) {
                    kkk1++;
                }
            }
            if (kkk1 == 6) {
                kkk1 = 1;
            }
        }

        int kk2 = 0;
        for (int i = 0; i < answers.length; i++) {
            three[i] = ang[kk2];
            kk2++;
            if (kk2 == 10) {
                kk2 = 0;
            }
        }

        System.out.println(Arrays.toString(three));

        int oneCnt = 0;
        for (int i = 0; i < answers.length; i++) { // 1번넘이 맞은 갯수 반환
            if (answers[i] == one[i]) {
                oneCnt++;
            }
        }

        int twoCnt = 0;
        for (int i = 0; i < answers.length; i++) { // 2번넘이 맞은 갯수 반환
            if (answers[i] == two[i]) {
                twoCnt++;
            }
        }

        int threeCnt = 0;
        for (int i = 0; i < answers.length; i++) { //3번넘이 맞은 갯수 반환
            if (answers[i] == three[i]) {
                threeCnt++;
            }
        }

        int[] cntArr = {oneCnt, twoCnt, threeCnt};
        int max = oneCnt;
        int who = 1;
        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i] > max) {
                max = cntArr[i];
                who = i + 1;
            }
        }

        int overload = 0;
        for (int i = 0; i < cntArr.length; i++) {
            if (max == cntArr[i]) {
                overload++;
            }
        }

        answer = new int[overload];

        int k3 = 0;
        if (overload >= 2) {
            for (int i = 0; i < cntArr.length; i++) {
                if (max == cntArr[i]) {
                    answer[k3] = i + 1;
                    k3++;
                }
            }
        } else {
            answer[0] = who;
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] answers = {5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        System.out.println(Arrays.toString(solution(answers)));
    }
}