package _10_day.exception.trycatch;

public class TryccatchEx01 {
    public static void main(String[] args) {

        int x = 10;
        int y = 0;

        System.out.println(x + y);

        try {
            System.out.println(x / y);
        } catch (Exception e) {
            System.out.println("0으로 나누지 마세요!");
        }

        System.out.println(x / y);



        System.out.println(x * y);



    }
}
