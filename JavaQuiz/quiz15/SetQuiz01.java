package quiz15;

import java.util.*;

public class SetQuiz01 {
    public static void main(String[] args) {

        // 리스트로 로또번호 구하기

        List<Integer> list = new ArrayList<>();

        Random ran = new Random();

        while ( list.size() < 7 ) {
            int num = ran.nextInt(45) + 1; // 1 ~ 45

            if (list.contains(num)) {
                continue;
            }
            list.add(num);
        }

        System.out.println(list.toString());

        System.out.println("-----------------------------------");
        // Set 을 사용해서 로또번호 구하기

        Set set = new TreeSet();
//        Iterator<String> iter = set.iterator();

        while ( set.size() < 7 ) {

            int ran2 = ran.nextInt(45) + 1;
            set.add(ran2);

        }
        System.out.println(set.toString());
    }
}
