package api.collectionFrameWork.collection.set;

import java.util.*;

public class TreeSetEx {

    public static void main(String[] args) {

        // TreeSet = 정렬 된 셋
        // 트리구조, 이진 탐색 트리 구조를 가지고 있다.
        // 사용방법은 HashSet과 동일함.

        Set<String> set = new TreeSet<>();

        set.add("홍길자");
        set.add("홍길자");
        set.add("짱구");
        set.add("철수");
        set.add("훈이");
        set.add("유리");

        System.out.println(set.toString()); // 자동 오름차순 정렬.
        // 나머지 기능은 HashSet 과 동일함.

    }


}
