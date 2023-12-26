package _06_day.inherit.good;

public class Person extends Mother { // 부모 클래스
    String name;
    int age;

    String info(){
        return "이름:" + name + ", 나이" + age;
    }
}
