package quiz14;

public class ArraysQuiz01 {

    public static void main(String[] args) {

        //프로그래머스 문제
        /*
         * participant는 달리기 참가자 명단
         * completion 딜리기 완주자 명단
         *
         * completion 항상 participant 길이가 1명 작습니다.
         * 완주하지 못한 사람의 이름을 찾아서 반환하는 solution메서드
         */
        String[] participant = {"강동원", "이순신", "홍길자", "신사임당"};
        String[] completion = {"홍길자", "신사임당", "이순신"};

        System.out.println(solution(participant, completion));

    }

    public static String solution(String[] participant, String[] completion) {

        String result = "";

        String[] newCompletion = new String[completion.length + 1];
        boolean[] b = new boolean[completion.length + 1];
        int index = 0;
        for (int i = 0; i < completion.length; i++) {
            newCompletion[i] = completion[i];
        }

        for (int i = 0; i < participant.length; i++) { // 비교 트루
            for (int j = 0; j < participant.length; j++) {
                if (participant[i].equals(newCompletion[j])) {
                    b[i] = true;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            if(!b[i]) {
                index = i;
            }
        }

        for (int i = 0; i < participant.length; i++) {
            if (i == index) {
                result = participant[i];
             }
        }
        return result;
    }
}
