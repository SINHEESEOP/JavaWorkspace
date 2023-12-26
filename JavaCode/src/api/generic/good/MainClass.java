package api.generic.good;

import _01_day.Casting01;

public class MainClass {
    public static void main(String[] args) {
//        이렇게도 사용 가능하지만 이렇게 쓰지 마셈
//        ABC abc = new ABC();
//        abc.setT("홍길동");

        ABC<String> abc = new ABC<>();
        abc.setT("홍길동");
        String name = abc.getT();
        System.out.println("--------------------------------");

        // int로 저장하는 용도의 객체 (반드시 wrapper만 쓸 수 있어요)
        ABC<Integer> abc2 = new ABC<Integer>();
        abc2.setT(10);
        int age = abc2.getT();
        System.out.println("-----------------------------------");

        ABC<Person> abc3 = new ABC<>();
        abc3.setT(new Person());
        Person p = abc3.getT();
    }
}
