package _09_day.abs.good;

public abstract class Store {
    /*
        추상 클래스
        1. 클래스에 abstract 를 붙이면 추상클래스가 됩니다.
        2. 메소드에 abstract 를 붙이면 추상메소드가 됩니다.
        3. 추상 메소드는 {} 가 없는 메서드의 선언 입니다.
     */
    public   int a = 1;

    private String name = "호식이 과일가게";
    public Store() {
        System.out.println("추상클래스의 생성자 호출됨");
    }

    public abstract void apple();
    public abstract void melon();
    public abstract void orange();

    public final void mango () { // 오버라이드 금지
        System.out.println("본점에서 1000원 고정가격 입니다");
    }

    public String getName() {
        return name;
    }

}
