package _08_day.static2;

import _08_day.staticMethod.Count;

public class Computer extends Computer2{

    public static String company;
    public int price;

    static { // 정적 초기화자 - 단 1번만 실행됩니다.
        company = "LG";
        System.out.println("정적 초기화자 객체를 3개 만들어도 딱 한번만 실행");
    }

    public Computer (int price) {
        this.price = price; // 일반변수 초기화
//        this.company = "LG";
    }

}
