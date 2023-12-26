package _08_day.basic;
public class PolyBasic {
    /*
        자바에서 하나의 클래스 파일에 여러 클래스 선언이 가능합니다.
        단, 파일명과 동일한 클래스가 존재해야 하고, 해당 클래스만 public 이어야 합니다.
     */
    class A {}
    class B extends A {}
    class C extends A {}
    class D extends B {}
    class E extends C {}
    /*
        다형성 - 객체가 다양한 형태를 가지는 성질
        -> 자식 객체가 부모 타입을 가질 수 있는 성질
        -> 즉 부모 클래스로 자식 인스턴스를 만들 수 있다.
     */
    A a = new A();
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

    A a1 = b; // B -> A타입으로 자동형변환
    A a2 = new B();
    A a3 = new C();
    A a4 = new D();
    A a5 = new E();

    // 오브젝트는 최상위 부모라 자식 인스턴스를 전부 만들 수 있지만
    // 오브젝트 형으로 변환되기 때문에, 예시로 오브젝트로 String 인스턴스 생성 시
    // String 기능을 사용할 수 없다.

    Parent p = new Child();

}