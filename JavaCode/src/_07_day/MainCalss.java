package _07_day;

public class MainCalss {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        // setter 메서드의 사용법
        hotel.setChef(new Chef());

        // getter 메서드의 사용법
        Chef chef = hotel.getChef();
        chef.cooking();

        //

    }
}
