package _09_day.abs.bad;

public class Main {
    public static void main(String[] args) {
        SeoulStore store = new SeoulStore(); //자식객체 생성

        store.apple(); // apple 은 반드시 오버라이딩 해야하는데, 잘못된 메소드 호출로 연결될 수 있다.
        store.melon();
        store.orange();

    }
}
