package _05_day;

public class Pen {

    String ink;
    int price;
    String company;

    void write () {
        System.out.println(ink + " 색상을 씁니다.");
    }
    String info () {
        System.out.println("===펜의 정보===");
        System.out.println("색상: " + ink);
        System.out.println("가격: " + price);
        System.out.println("제조사: " + company);

        return company;
    }

}
