package _04_day;

public class MethodOverLodingEx01 {
    public static void main(String[] args) {
        // 메서드의 연쇄 호출 (동기적 처리) // 동기적 처리란?
        test01();
        // 메서드의 재귀함수
        rescursive(1);
    }
    static void test01 () {
        System.out.println("test01시작");
        test02(); // 2번 메소드 호출
        System.out.println("test01끝");
    }
    static void test02 () { System.out.println("나는 2번 메소드 지롱"); }
    static void rescursive (int a) { // 재귀메소드(함수)
        //재귀는 반복과 비슷함, 탈출 조건이 필요함.
        System.out.println(a);
        if(a == 10) return; // 탈출 조건
        a++; // 1증가
        rescursive(a);
        System.out.println(a + " 함수 종료 됨");
    }
}
