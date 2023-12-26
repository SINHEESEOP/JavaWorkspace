package _06_day.inherit.good;

public class MainClass {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "홍길동";
        p.age = 1000;
        p.gender = "자웅동체";
        System.out.println(p.info());

        Student s = new Student();
        s.name = "서명인";
        s.age = 29;
        s.studentId = "123456";
        s.gender = "남자";
        System.out.println(s.info());

        Teacher t = new Teacher();
        t.name = "박인욱";
        t.age = 40;
        t.subject = "그냥 외우세요";
        System.out.println(t.info());

        Employee e = new Employee();
    }
}
