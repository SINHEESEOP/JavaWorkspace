package _05_day;

public class Person {
    int age;
    int tall;
    String name;

    void info() {
        System.out.println(age);
        System.out.println(tall);
        System.out.println(name);
    }
    Person () {}
    Person (int age1, int tall1, String name1) {
        age = age1;
        tall = tall1;
        name = name1;
    }
}
