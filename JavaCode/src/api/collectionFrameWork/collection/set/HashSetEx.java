package api.collectionFrameWork.collection.set;

import java.util.*;

public class HashSetEx {


    public static void main(String[] args) {

        // 해쉬 알고리즘을 사용하고 있어 해쉬셋이다.

        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("java"); // 중복 x
        set.add("js");
        set.add("python");
        set.add("spring");

        System.out.println(set.size());
        System.out.println(set.toString()); // 순서 x

        // 값이 포함되어 있는지 확인
        if(set.contains("java")) {
            System.out.println("java 가 포함됨");
        }

        // 값을 얻을 때는 반복자(iterrator) 개념을 사용해서 반복해야 합니다.
        // 바구니에 섞여 있던 값들이 확인하기 위해 일자로 쭉 나열해서 바꾼 형태?
        // 그래야 커서로 한칸씩 이동해서 확인이 가능.
        Iterator<String> iter = set.iterator();
        System.out.println(iter);

        iter.hasNext(); // 다음이 있어? 있으면 true를 반환
        iter.next(); // 커서 한칸 앞으로 이동~

        for ( String s : set ) { // 반복자 개념이다. 즉 iterrator 를 사용하지 않아도 자동 반복자 형태로 만들어줌
            System.out.println(s);
        }

        set.remove("js");
        System.out.println(set.toString());

    }
}
