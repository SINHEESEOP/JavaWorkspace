package _08_day.basic;

public class Child extends Parent {

    // 메서드 2번 오버라이드
    public void method02() {
        System.out.println("오버라이딩 된 2번 메서드");
        super.method02();
    }

    public void method03() {
        System.out.println("자식의 3번 메서드 실행");
    }
}
