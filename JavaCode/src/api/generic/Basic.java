package api.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Basic {
    public static void main(String[] args) {
        // 여러분이 자바를 사용하다보면 ? 라고 하는 제네릭 문법이 보입니다.
        // List<?> = 리스트면 무엇이든 다 들어갈 수 있다.
        // List<? extends String> = ? 가 String 타입의 자식은 들어갈 수 있음
        // List<? super Integer> = ? 가 Integer 의 형태가 될 수 있다면 들어갈 수 있음.

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        List<Integer> list2 = Arrays.asList(1,2);
        System.out.println(list2);

        System.out.println(list.containsAll(list2)); // 1, 2 가 포함 되어 있다면 true

        System.out.println("-------------------------------------------------------");

        List<String> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Objects> l3 = new ArrayList<>();
//        List<SubtypeOfString> l3 = new ArrayList<>();

        add1(l1);
        add1(l2);
        add1(l3);

        add2(l1);
//        add2(l2);
//        add2(l3);


    }

    public static List<String> add1 (List<?> list) {
        return null;
    }
    public static void add2 (List<? extends String> list) {

    }
    public static void add3 (List<? super Integer> list) {

    }
}
