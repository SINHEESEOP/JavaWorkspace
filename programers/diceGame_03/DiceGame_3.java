package programers.diceGame_03;

public class DiceGame_3 {

    static int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] list = {a, b, c, d};
        int canSameCount = 0; // 중복 값이 몇개 인지 // 중복값이 12개면 4개라는 소리다.

        int notSameValue1 = 0; // 개별 값1
        int notSameValue2 = 0; // 개별 값2

        int sameValue = 0; // 중복 값 (큰 값)
        int sameValue2 = 0; // 중복 값2 (작은 값)


        // 중복 값이 몇 인지 + 몇 개인지 뽑아내는 함수
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) { // 리스트 내용들을 서로 전부 교차 비교 가능함
                    if (sameValue < list[i])
                        sameValue = list[i];
                    canSameCount++;
                }
                if (sameValue > list[i]) {
                    sameValue2 = list[i];
                }
            }
        }

        // 다른 값이 몇 인지 + 몇 개인지 뽑아내는 함수
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] != list[j]) {
                    if (sameValue != list[j] && notSameValue1 == notSameValue2) {
                        notSameValue1 = list[j]; // 2
                    }
                    if (sameValue != list[j] && notSameValue1 != notSameValue2) {
                        notSameValue2 = list[j] - 1; // 3
                    }
                }
            }
        }

        // 1. 조건
        if (canSameCount == 12) {
            answer = sameValue * 1111;
        }
        // 2. 조건
        if (canSameCount == 6) {
            answer = (10 * sameValue + notSameValue1) * (10 * sameValue + notSameValue1);
        }
        // 3. 조건
        if (canSameCount == 4 && sameValue != sameValue2) {
            answer = (sameValue + sameValue2) * (sameValue - sameValue2);
        }
        // 4. 조건
        if (canSameCount == 2) {
            answer = notSameValue1 * (notSameValue2 + 1);
        }
        // 5. 조건
        if (canSameCount == 0) {
            answer = 2;
        }
        return answer;

    }
    public static void main(String[] args) {
        System.out.println(solution(1,1,2,2)); // 결과 값 3 나와야함
                                                            // 5번 조건 풀어여함
                                                            // 그 외 실패 부분 수정 필요
    }
}
