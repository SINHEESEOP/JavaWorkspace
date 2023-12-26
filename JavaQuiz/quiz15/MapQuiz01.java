package quiz15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapQuiz01 {



    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("aaa123", "1234");
        map.put("bbb123", "5678");
        map.put("ccc123", "0000");

        /*
            1. 아이디와 비밀번호를 입력받아서 맵에 있는 키인지 검사합니다.
            2. 아이디가 존재하면, 비밀번호와 검사해서, 비밀번호가 일치하면 "로그인 성공" 처리
            3. 비밀번호가 다르다면, "비밀번호가 틀렸습니다." 출력하면 됩니다.
            4. 만약 아이디가 맵에 입력된 키가 아니라면 "없는 아이디 입니다" 출력.

         */

        Scanner sc = new Scanner(System.in);

        esc:
        while (true) {

            System.out.println("아이디를 입력해주세요.");
            String id = sc.next();

            if (map.containsKey(id)) {
                System.out.println("비밀번호를 입력해주세요.");
                String pass = sc.next();

                if (map.get(id).equals(pass)) {
                    System.out.println("로그인 성공");
                    break esc;
                } else {
                    System.out.println("비밀번호가 틀렸습니다.");
                    while (true) {
                        System.out.println("비밀번호를 다시 입력해주세요.");
                        String pass2 = sc.next();
                        if (map.get(id).equals(pass2)) {
                            System.out.println("로그인 성공");
                            break esc;
                        }
                    }
                }
            } else {
                System.out.println("아이디가 틀렸습니다.");
            }
        }



    }
}
