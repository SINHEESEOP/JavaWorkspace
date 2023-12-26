package api.collectionFrameWork.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx01 {

    public static void main(String[] args) {

//         밥 먹는 횟수보다 많이 사용됨.
//        ArrayList<String> list = new ArrayList<>();
        List<String> list = new ArrayList<>();

//        값의 추가
        list.add("Java");
        list.add("Spring");
        list.add("Database");
        list.add("Js");
        list.add("Docker");

        System.out.println(list.toString());

//        크기 확인
        System.out.println(list.size());

//        값을 중간에 추가
        list.add(2, "앙기모띠");
        System.out.println(list.toString());

//        값을 한번에 추가 or 배열을 그대로 이어 붙여서 넣기.
        String[] arr = {"A", "B", "C"};
        List<String> newList = Arrays.asList(arr);

        list.addAll(newList);
        System.out.println(list.toString());

//        값의 확인 get
        System.out.println(list.get(0));
        System.out.println(list.get(1));

//        값의 삭제 remove(인덱스) or (값)
        System.out.println(list.remove("앙기모띠"));
        System.out.println(list.toString());

        String x = list.remove(0); // 삭제와 동시에 반환도 해드림.
        System.out.println(x);
        System.out.println(list.toString());

//        값의 수정 set
        list.set(3, "홍길동");
        System.out.println(list.toString());

//        포함여부 확인
        if (list.contains("Java")) {
            System.out.println("Java가 존재함");
        }
//        list.containsAll(); // 컬렉션 상속받은 배열넣어주면 해당 배열 전체 내용과 비교해줌.



    }
}
