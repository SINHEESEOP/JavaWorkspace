package _05_day;

public class ObjectBasic01 {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println(cal.add(10));
        System.out.println(cal.add(20));
        System.out.println(cal.add(30));

        Calculator cal2 = new Calculator();

        System.out.println(cal2.add(10));
        System.out.println(cal2.add(20));
        System.out.println(cal2.add(30));

    }
//    static int result;
//    static int add (int a) {
//        result += a;
//        return result;
//    }
}
