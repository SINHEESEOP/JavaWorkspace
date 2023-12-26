package quiz04;

public class MainClass {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.info();
        Child c = new Child("아조씨", "아줌니");
        c.info();

        Car car = new Car("페라리");
        car.run();
    }
}
