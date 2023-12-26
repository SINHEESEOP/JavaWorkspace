package 막써막써;

public class 연습장2 {

    int a;


    public static void main(String[] args) {

        A a = new A();

        a.a = "안녕";
        a.b = 10;
        change(a.b);

        System.out.println(a.a);

    }

    public static void change(int b) {
//        this.a = b;

    }

}

class A {
    String a;
    int b;

}
