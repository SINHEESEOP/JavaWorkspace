package _06_day.inherit.good;

public class Employee extends Person {
    String department;

    Employee () {
        name = "신희섭";
        age = 26;
        gender = "남자";
        department = "백수";
    }

    Employee (String name, int age, String gender, String department) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
    }

}
