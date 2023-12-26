package _06_day.override.basic2;

import _06_day.inherit.good.Mother;

public class Person { // 부모 클래스
    String name;
    int age;

    String info(){
        return "이름:" + name + ", 나이" + age;
    }
}
