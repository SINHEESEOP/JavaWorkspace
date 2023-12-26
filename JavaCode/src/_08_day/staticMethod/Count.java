package _08_day.staticMethod;

public class Count {
    public int a;
    public static int b;

    // 일반 메서드 - 일반 변수, 정적 변수 모두 사용이 됩니다.
    public int method() {
        a = 10;
        b = 10;
        b++;
        return b;
    }

    // 정적 메서드 - static. 멤버만 사용아 됩니다.
    public static int method2() {
//        a = 10; // 객체가 없는데 사용이 되냐규?
        // 객체 생성해서는 접근이 가능.
        Count c = new Count();
        c.a = 10;
        b++;
        return b;
    }
}
