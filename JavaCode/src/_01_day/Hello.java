package _01_day;

import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello world!\n");
        System.out.print("헬로 월드\n");

        // 세번째 출력문 printf - 서식문자 or 탈출문자 를 이용한 출력
        System.out.printf("오늘은 %d년 %d월 %d일 이고, 저는 %s 입니다\n", 2023, 10, 25, "coding404");
        //  서식문자의 종류
        /*
            %d 는 정수가 전달됨
            %f 는 실수가 전달됨, %.xf 출력할 소수점 자리 정할 수 있음
            %s 는 문자열이 전달됨

            탈출문자의 종류

            \n 은 줄바꿈
            \t tap 버튼
            \r 캐리지 리턴

        */
        System.out.printf("PI값은 %f 입니다.", 3.141592);

        System.out.printf("PI값은 %f , %.2f 입니다.", 3.141592, 3.141592);

        // 컨트롤 + 알트 + L 로 들여쓰기 정렬 가능.
        // 컨트롤 + 쉬프트 + 방향키로 코드 위치 옮기기 가능
        // 컨트롤 or 알트 방향키로 페이지 위아래 빠르게 넘길 수 있음
        // 컨트롤 + Y 는 행삭제
        // 컨트롤 + D 는 행복사

        // 클래스는 무조건 대문자로 적는다


    }
}