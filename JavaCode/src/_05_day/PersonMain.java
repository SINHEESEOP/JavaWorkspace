package _05_day;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 40;
        p1.tall = 180;
        p1.name = "홍길동";
        p1.info();

        System.out.println("=====================");

        Person p2 = new Person(20, 185, "신희섭");
        p1.info();

    }
}
