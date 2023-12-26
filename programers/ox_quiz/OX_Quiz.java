package programers.ox_quiz;

import java.util.Arrays;

public class OX_Quiz {
    static String[] solution(String[] quiz) {
        String[] answer = {};
        int cnt = 0;
        for (int i = 0; i < quiz.length; i++) {
            cnt++;
        }
        answer = new String[cnt];
        for (int i = 0; i < quiz.length; i++) {
            String oX = quiz[i];
            String[] newOX = oX.split(" ");
            int result = 0;
            int num1 = Integer.parseInt(newOX[0]);
            int num2 = Integer.parseInt(newOX[2]);
            int resultEx = Integer.parseInt(newOX[4]);
            if (newOX[1].equals("-")) {
               result = num1 - num2;
            } else {
                result = num1 + num2;
            }
            answer[i] = result == resultEx ? "O" : "X";
        }
        return answer;
    }




    public static void main(String[] args) {

        String[] a = {"3 - 4 = -3", "5 + 6 = 11"};

        solution(a);
        System.out.println(Arrays.toString(solution(a)));

        /*
        배열에 각 인덱스 번호에 수식들이 하나씩 있음
        배열 인덱스를 순서대로 받으면서
        각 인덱스 순서에 식을 문자로 쪼개어

         */

    }
}
