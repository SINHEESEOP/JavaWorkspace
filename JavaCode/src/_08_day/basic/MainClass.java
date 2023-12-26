package _08_day.basic;

public class MainClass {
    public static void main(String[] args) {
        Child child = new Child();

        child.method01(); // 상속받은 메소드
        child.method02(); // 오버라이드 한 메소드
        child.method03(); // 자식의 메소드

        System.out.println("=======================================");
//        Child child = new Child();
//        Parent p = child;
//        위 두 코드 전부를 줄여 쓴 것이 아래 코드
//        Parent p = new Child();
//        Child 객체 생성 후 위 코드 줄 생성 시 객체가 두개가 생성되어 주소값이 다르게 되는것.

        Parent p = child;

//        Parent p = child; // 해당 방식으로 하면 주소값음 왜 why? new 를 한번더 선언 안하니까.

        p.method01(); // 부모 메소드
        p.method02(); // 오버라이드한 자식 메소드
        // p.method03(); // 사용불가

        System.out.println(p);
        System.out.println(child);

        // Class Casting 하는 법
        Child cc = (Child) p; // p 는 다형성이 적용 되었던 변수
        System.out.println(cc);
        System.out.println(p == cc);

        Parent p1 = new Parent();
        Object ch = new Child();
        

        /*
            자신의 클래스로 자신의 인스턴스를 생성 후
            부모 클래스로 프로모션, 즉 부모타입으로 형 변환 시
            다시 다운 캐스팅, 즉 자식 클래스(자기자신)로 복원 가능
         */

        /*
            Child child = new Child();
            Parent p = child;
            자식 클래스로 자식 인스턴스 생성 후
            부모타입 p 변수에 child 를 저장한 것

            이것을 한번에 줄이면
            Parent p = new child();
            부모 클래스로 자식 클래스를 생성 (new 가 붙었기 때문)
            부모 클래스 타입 p 에다가 자식 클래스를 저장.
         */

          /*
             다시 정정
             부모클래스로 자식 객체를 만든다? 아니다. // 아니 맞다.
             자식 클래스로 자식 객체를 만든 것이고
             사실상 Child c = new Child 일 때
             Child 클래스 c 변수에 차이들 객체를 저장한다는 뜻이다.
             이때 앞에 Child 가 클
           */

        /*
            다시 정정
            부모클래스로 자식 객체를 만드는 것이 가능하지만,
            만들어진 객체는 부모 클래스의 인스턴스이기 때문에
            부모 클래스의 기능만 사용 가능하다. (단 오버라이드된 메서드는 자식꺼 사용)
            단 해당 객체는 자식 객체(자기자신)로 다운캐스팅이 가능하며
            주소값이 달라도, 상속관계에 있는 객체들은 전부 같은 타입이라고 볼 수 있다.
            단 하위 클래스가 상위 클래스와 타입이 같은 것이지 상위 클래스가 하위 클래스와 타입이 같은 것은 아니다.

         */
    }
}
