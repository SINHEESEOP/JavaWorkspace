package quiz09;

public class Rect extends Shpae {

    /*
        1. 사각형은 생성될 때, 도형이름과, 반지름을 받아서 초기화
        2. getArea() 는 사각형의 넓이 반환
     */
    private int side; // 변의 길이
    public Rect(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
