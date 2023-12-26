package _07_day;

public class Hotel {

    String name;
    private Chef chef;

    // 호텔이 생성될 때 초기값을 갖는다.
    public Hotel() {
        this.chef = new Chef();

    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }
}
