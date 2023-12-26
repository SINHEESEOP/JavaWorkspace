package _08_day.static_;

public class Calculator {

    /*
        객체에서 서로 다른값을 가져야 하는 경우는 일반 멤버변수가 됩니다.

     */
    private static int result;
    private String color;
    int a = 3;

//    public static void abc () {
//        System.out.println(a); // static 메소드는 일반 변수 사용 불가
//    }
//    일반 메소드는 스태틱 변수를 사용 가능, 하지만 스태틱 메소드는 일반 변수를 사용 불가
    /*
        객체마다 동일한 값을 가져아하는 경우는 static 변수가 됩니다.
     */

    public static double pi = 3.14;

    /*
        일반 변수를 참조하는 메소드는 일반 메소드 됩니다. (static X)
     */

    public static double circle (double a) {
        return pi * a * a;
    }

    public int add (int a) {
        setResult(result += a);
        return getResult();
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Calculator.pi = pi;
    }

    /*
        메서드 안에서 일반 멤버변수를 쓰지 않고, 범용성있게 사용할 메서드는 static을 붙이면 됩니다.
     */

    // 원의 넓이
    public double circle (int radius) {
        return radius * radius * pi;
    }



}
