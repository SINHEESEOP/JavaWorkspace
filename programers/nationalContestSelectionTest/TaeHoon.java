package programers.nationalContestSelectionTest;

import java.util.Arrays;

public class TaeHoon {
    public static int solution(int[] rank, boolean[] attendance) {

        int[] rank_copy = new int[rank.length];
        // 새로운 배열에 ture 일때 값 넣어주기 false 일때 100 넣어주기
        for(int i = 0; i < rank_copy.length;i++) {
            if(attendance[i]) {
                rank_copy[i] = rank[i];
            }else {
                // attendance의 길이 ≤ 100 이기때문
                rank[i] = 100;
            }
        }
        // rank 정렬
        Arrays.sort(rank); //출력 [2,3,5,7,100,100,100]
        // for 문 i가 0 으로 시작하면 인덱스 값이라고도 볼수 있다
        int answer = 0;
        for(int i = 0; i < rank_copy.length; i++) {
            if(rank[0] == rank_copy[i]) {
                answer = answer + i * 10000;
            }if(rank[1] == rank_copy[i]) {
                answer = answer + i * 100;
            }if(rank[2] == rank_copy[i]) {
                answer = answer + i;
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};


        System.out.println(solution(rank, attendance));

    }
}
