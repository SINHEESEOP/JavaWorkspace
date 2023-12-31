package _06_day.override.basic;

public class Child extends Parent{
    // 오버라이딩 규칙 - 부모님의 메소드와 동일하게 선언하고, 내용을 바꾼다.
    //              - 오버라이드 된 메서드는 무조건 먼저 실행됩니다.

    void method01() {
        super.method01();
        System.out.println("자식의 오버라이드 된 메서드");
    }

    @Override
    void method02() {
        super.method01();
    }
}
