package _05_day;

public class PenMain {
    public static void main(String[] args) {

        Pen redPen = new Pen();

        // 기능을 사용하고 싶으면 참조연산자 . 을 사용한다.

        redPen.ink = "red";
        redPen.price = 1000;
        redPen.company = "교과서로 배우고 빨간펜으로 다지고";
        redPen.write();
        redPen.info();
    }
}
