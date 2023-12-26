package programers.pickTwoAndAddThem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class PickTwoAndAddThem {

    public static int[] solution(int[] numbers) {
        int[] answer = {};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) { // 첫번째 값을 기준으로 뒤 값을 쭉 다하면서 반복.
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    arrayList.add(numbers[i] + numbers[j]); // 더한 값 넣어줌
                }
            }
        }

        Collections.sort(arrayList); // sort 함.
        LinkedHashSet<Integer> setHashlist = new LinkedHashSet<>(arrayList); // 중복값 제거함
//        ArrayList<Integer> arrList1 = new ArrayList<>(setHashlist); // 다시 어레이 리스트에 담아줌
        answer = new int[setHashlist.size()]; // 일반 배열길이 지정
        int index = 0;
        for (Integer i : setHashlist) {
            answer[index] = i;
        }

//        for (int i = 0; i < setHashlist.size(); i++) { // 리스트를 일반 배열로 담아줌
//            answer[i] = setHashlist[i];
//        }
        return answer; // 끝
    }


    public static void main(String[] args) {
        int[] arr = {2,1,3,4,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
