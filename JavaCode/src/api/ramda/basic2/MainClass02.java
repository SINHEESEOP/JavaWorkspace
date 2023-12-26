package ramda.basic2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainClass02 {

    public static void main(String[] args) {

        /*
         * 펑셔널인터페이스
         * Consumer - 매개변수가 1개 이상이고, 반환은 void
         * Predicate - 매개변수가 1개 이상이고, 반환이 boolean
         * Function - 매개변수가 1개 이상이고, 반환은 임의의 타입
         */

        //100개의 랜덤한 값을 가지고 있는 리스트
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Random().nextInt(100) + 1);
        }
        System.out.println(list.toString());

        System.out.println("-----------------------------------");

        //중복제거
        list.stream().distinct().forEach(a -> System.out.print(a + " "));

        System.out.println("\n-----------------------------------");

        //return에 true인 값들만 필터링해서 저장
        list.stream().filter(a -> a > 50).forEach(a -> System.out.print(a + " "));

        System.out.println("\n-----------------------------------");

        //정렬
        list.stream().sorted().forEach(a -> System.out.print(a + " "));

        System.out.println("\n-----------------------------------");

        //map -> 메서드 안에 정의된 내용을 기준으로 새로운 리스트를 만듬
        //a는 리스트의 요소, 반환은 임의의 새로운값
        list.stream().map(a -> a % 2 == 0 ? true : false).forEach(a -> System.out.print(a + " "));


        System.out.println("\n-----------------------------------");

        list.stream()
                .distinct()
                .map(a -> a > 50 ? a : 0)
                .filter(a -> a != 0)
                .sorted()
                .forEach(a -> System.out.print(a + " "));

        System.out.println("\n-----------------------------------");

        //collect = 최종수집함수(새로운 list, set, map) 반환을 받을 수 있음
        List<Integer> newList = list.stream()
                .map(a -> a < 0 ? -a : a)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(newList);


        System.out.println("--------------------------------------");

        List<String> list2 = Arrays.asList("hong", "LEE", "Park", "Choi");

        //각 이름의 최초 0번째 글자를 얻어서, 전부 대문자로 치환하고, 알파벳순으로 정렬한 결과를 리스트로 반환받는다

        List<String> newlist2 = list2.stream()
                .map(a -> a.substring(0,1).toUpperCase() + a.substring(1,a.length()))
				.sorted()
                .collect( Collectors.toList() );

		System.out.println(newlist2);

    }
}
