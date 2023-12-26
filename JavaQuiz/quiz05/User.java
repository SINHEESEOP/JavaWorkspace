package quiz05;

public class User {

    private String name;
    private int rrn;
    private int age;

    // 생성자, 게터, 세터 생성하기

    public User() {
    }

    public User(String name, int rrn, int age) {
        this.name = name;
        this.rrn = rrn;
        this.age = age;
        System.out.printf("이름은 %s, 번호는 %d, 나이는 %d %n", this.name, this.rrn, this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRrn() {
        return rrn;
    }

    public void setRrn(int rrn) {
        this.rrn = rrn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
