package _08_day.final_;

public /* final */ class Child extends Parent { // 상속 금지

    public final int a;

    public Child (int a) {
        this.a = a;
    }

    // 생성자를 통한 초기화 방법의 간단 예시임
    // 단 생성자가 아래에 있어도 되는 이유는 우선순위가 생성자가 먼저이기 때문이다.
    int b = 10;
    public final int c = b;

    @Override
    public void abc() {
        System.out.println("ABCD");
    }
}
