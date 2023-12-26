package _06_day.override.basic2;

public class Employee extends Person {
    String department;

    Employee () {
        name = "신희섭";
        age = 26;
        department = "백수";
    }

    Employee (String name, int age, String gender, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

}
