package _05_day;

public class Variable {
    int a;

//    int a = 10; // 가능
//    a = 10; // 불가능

    void printNum(int c) {
        int b = 1;
        System.out.println("멤버변수 : " + a);
        System.out.println("지역변수 : " + b);
        System.out.println("매개변수 : " + c);

    }
}
