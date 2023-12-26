package _03_day;

import java.util.Scanner;

public class ArrayUpdate {
    public static void main(String[] args) {

        // 배열에서 값을 찾고 수정.
        String[] arr = {"홍길동", "이순신", "피카츄", "라이츄", "꼬부기"};

        // 어떤값을 받아서 그 값이 있다면 수정, 없다면 넘어감
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 값 입력>");
        String name = sc.next();

        // 입력한 값을 찾는다.
        boolean bool = false; // 값을 찾았는지 여부 확인을 위한 변수.

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(name)) {
                System.out.println(arr[i] + "님을 수정할게요!");

                System.out.println("수정 값 입력>");
                arr[i] = sc.next(); // 수정값을 입력받고 바로 배열에 넣어줌.

                bool = true; // 찾았음!(if문을 실행함)
                break;
            }
        }

        // 불
        if (bool) {
            System.out.println("수정이 완료 되었습니다!");
        } else {
            System.out.println("찾는 값은 없습니다.");
        }




    }
}
