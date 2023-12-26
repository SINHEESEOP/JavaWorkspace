package _08_day.singleton;

public class Person {
    // 디자인 패턴 - 클래스 멋지게 설계하는 방법론
    // 싱글톤 패턴 - 객체를 1개만 생성되도록 설계하는 방법

    // 1. 나 자신의 객체를 멤버변수로 1개 생성합니다.
    private static Person p = new Person();

    private Person () {

    }

    public static Person creatInstance() { // 요 방식은 생성자 접근만 제한하고, 객체는 여러개 생성
        return new Person();
    }

    public Person getPerson () {
        return p;
    }
}
