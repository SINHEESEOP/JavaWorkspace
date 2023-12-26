package _08_day.static_;

public class MainClass {
    public static void main(String[] args) {

        Count c1 = new Count();
        c1.a++;
        c1.b++;

        System.out.println("일반 변수 : " + c1.a);
        System.out.println("정적 변수 : " + c1.b);

        Count c2 = new Count();
        c2.a++;
        c2.b++;

        System.out.println("일반 변수 : " + c2.a);
        System.out.println("정적 변수 : " + c2.b);

        Count2 c3 = new Count2(); // 상속 클래스받은 클래스들 끼리도 동일.
        c3.a++;
        c3.b++;
        System.out.println("일반 변수 : " + c2.a);
        System.out.println("정적 변수 : " + c2.b);

        System.out.println("현재 c1.b : " + c1.b);
        System.out.println("현재 c2.b : " + c2.b);

        Count.b++;
        /*
            1. static 변수 객체들 사이에서 동일한 값을 갖게 한다.
            2. static 변수는 객체 바깥에 생성되므로, 객체 생성 없이 접근이 가능합니다.
                클래스명.변수명
         */
    }
}
