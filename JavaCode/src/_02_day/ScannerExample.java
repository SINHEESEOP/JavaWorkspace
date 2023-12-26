package _02_day;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //1. 스캐너 생성
        Scanner sc = new Scanner(System.in);

//        System.out.println("이름을 입력>");
//        String name = sc.next();
//
//        int age = sc.nextInt();
//
//        double cm = sc.nextDouble();
//
//        // String intro2 = sc.nextLine(); // 엔터 값을 소모시킴
//        String intro = sc.nextLine(); /// 문자열 -
//
//        System.out.println("나이 " + name + " 나이 "  + age + " 키 " + cm + " 자기소개 " + intro);
//
//
//        // 자원 해제
//        sc.close();

        // 실습
        System.out.print("바구니 크기 입력>");
        int baguni = sc.nextInt(); // 리스트 가 바구니
        System.out.print("사과의 개수 입력>");
        int apple = sc.nextInt(); // 리스트에 담길 사과 갯수

        int a = (apple / baguni);
        System.out.println(apple % baguni == 0 ? a : a + 1);



    }
}
