package programers.nationalContestSelectionTest;

import java.util.Arrays;

public class GungYun {
    class Solution {
        public int solution(int[] rank, boolean[] attendance) {
            int answer = 0;
            int ans_index = 0;
            int[] arr = rank.clone();
            int[] ans_arr = new int[rank.length];

            //참석가능여부가 false 이면 0으로 바꾼다
            for(int i = 0; i < attendance.length; i++){
                if(!attendance[i]){
                    rank[i] = 0;
                }
            }
            //정렬하면 등수대로 나온다
            Arrays.sort(rank);

            //정렬전 값이랑 정렬후 값이랑 비교해서 같으면,
            //정렬전의 인덱스를 ans_arr에 순서대로 저장
            for(int i = 0; i < rank.length; i++){
                if(rank[i] == 0)
                    continue;
                for(int j = 0; j < arr.length; j++){
                    if(rank[i] == arr[j]){
                        ans_arr[ans_index++] = j;
                    }
                }
            }
            //참석 가능한 사람 중 1등 2등 3등 결과값 계산
            answer = ans_arr[0] * 10000 + ans_arr[1] * 100 + ans_arr[2];
            return answer;
        }
    }
}
