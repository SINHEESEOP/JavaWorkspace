package _09_day.abs.good;

public class Main {

    /*
        추상클래스를 사용하려면, 자식으로 생성해서 추상클래스 타입으로 구체화 시켜야됩니다.
        객체의 추상화 라고 약속합니다.
     */

    public static void main(String[] args) {

        SeoulStore store = new SeoulStore();

        store.apple();
        store.melon();
        store.orange();
        store.mango();
        System.out.println(store.getName());

    }

}
