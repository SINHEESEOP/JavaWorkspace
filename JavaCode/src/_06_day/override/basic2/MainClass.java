package _06_day.override.basic2;

public class MainClass {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "홍길동";
        p.age = 1000;
        System.out.println(p.info());

        Student s = new Student();
        s.name = "서명인";
        s.age = 29;
        s.studentId = "123456";
        System.out.println(s.info());

        Teacher t = new Teacher();
        t.name = "박인욱";
        t.age = 40;
        t.subject = "그냥 외우세요";
        System.out.println(t.info());

        Employee e = new Employee();
    }
}
