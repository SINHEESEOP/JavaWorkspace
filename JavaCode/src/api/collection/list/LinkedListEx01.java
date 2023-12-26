package api.collection.list;

import java.util.*;

public class LinkedListEx01 {

    public static void main(String[] args) {

//        ArrayList 와 사용방법 동일함. // 둘다 사용가능 + 링크리스트만의 기능 사용.
        LinkedList<String> list = new LinkedList<>();

//        순수하게 리스트 기능만 사용가능
//        List<String> list = new LinkedList<>();
//        큐처럼만 사용가능
//        Queue<String> list = new LinkedList<>();

//        값의 추가
        list.add("홍길동");
        list.add("이순신");
        list.add("홍길자");
        System.out.println(list.toString());

//        링크 리스트만의 기능, 앞의추가, 끝의 추가
        list.addFirst("A");
        list.addLast("B");

        System.out.println(list.toString());

//        값 얻기
        String x = list.get(0);
        System.out.println(x);

//        값 삭제 remove(인덱스) , 값으로도 지울 수 있음.
        list.remove(0);
        list.remove("홍길동");

        System.out.println(list.toString());

//        값의 수정
        list.set(1, "홍길순"   );
        System.out.println(list.toString());

        System.out.println("---------------------------------------------------------");
//       que 기능도 사용 가능
        list.offer("1");
        list.offer("2");

        System.out.println(list.toString());

//        앞에 삭제
        System.out.println(list.poll());
        System.out.println(list.toString());

    }
}
