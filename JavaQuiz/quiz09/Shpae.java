package quiz09;

public abstract class Shpae {

    // 멤버변수
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 생성자
    public Shpae (String name) {
        this.name = name;
    }

    // 오버라이딩을 강제할 메소드는 추상메소드로 선언
    public abstract double getArea ();

    // 오버라이딩을 강제화 하지 않는다면
    public String getName() {
        return "도형이름 : " + name;
    }
}
