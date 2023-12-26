package _08_day.static2;

import _08_day.static_.Calculator;

public class Main {
    public static void main(String[] args) {
        /*
            1. 녹색 계산기 1개, 빨강색 계산기 1개 생성
            2. 계산기 색상 확인
            3. add(int a) 메소드를 추가 (result 누적)
            4. pi 변수를 사용해서 원의 너비
            5. cirlce() 사용해서 원의 넓이
         */

        Calculator red = new Calculator();
        Calculator green = new Calculator();

        red.setColor("red");
        System.out.println(red.getColor());

        green.setColor("green");
        System.out.println(green.getColor());

        System.out.println(red.add(1));

        System.out.println(Calculator.pi * 3 * 3);
        System.out.println(red.circle(3));
//        System.out.println(Calculator.circle(3);


        Computer com1 = new Computer(123);
        Computer com2 = new Computer(123);
        Computer com3 = new Computer(123);

        System.out.println( Computer.company );
    }
}
