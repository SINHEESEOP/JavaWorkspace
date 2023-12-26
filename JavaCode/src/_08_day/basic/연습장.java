package _08_day.basic;

public class 연습장 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p = new Child();
        Child cc = (Child) p;
        System.out.println(p == cc);

    }
}
