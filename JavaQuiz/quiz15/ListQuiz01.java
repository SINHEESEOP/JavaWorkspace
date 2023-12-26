package quiz15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListQuiz01 {




    public static void main(String[] args) {

        /*
        *   1. 1 ~ 20까지 리스트에 저장하기
        *   2. user 클래스를 저장하는 리스트를 생성하기
        *   - User 클래스 : name, age 를 은닉변수로 선언
        *   - 객체를 생성해서 list 추가
        *   - 이 리스트에 "홍길동" 이 있다면, 이름과 나이를 출력
        *   - 이 리스트에 "홍길자" 이 있다면, 객체를 삭제
        * */

        User user1 = new User("홍길자" , 20);
        User user2 = new User("홍길동" , 30);
        User user3 = new User("홍길" , 40);
        User user4 = new User("홍" , 50);

        List<User> list = new ArrayList<>();

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

//        for (int i = 0; i < list.size(); i++) { // 이렇게 하는 경우 1번째에 홍길동이 가서 i가 1이 된 이후는 찾을 수 없음.
////            if (list.get(i).getName().equals("홍길동")) {
////                System.out.println(list.get(i).getName());
////                System.out.println(list.get(i).getAge());
////            }
//
//            if (list.get(i).getName().equals("홍길자")) {
//                list.get(i).setName("대머리");
////                list.remove(list.get(i));
//            }
//        }
//        System.out.println(list.toString());

        for (User u : list) {
            if (u.getName().equals("홍길동")) {
                System.out.println(u.toString());
            }
            if (u.getName().equals("홍길자")) {
                list.remove(u);
            }
        }
        System.out.println(list.toString());
    }

}
