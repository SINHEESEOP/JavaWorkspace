package _08_day.staticMethod;

public class MainClass {
    public static void main(String[] args) {

        // main은 static 입니다.
        // a변수를 사용하고 싶으면 객체생성을 해서 사용함.

        // static 멤버를 호출할 때
        Count.b++;
        Count.method2();
    }
}
