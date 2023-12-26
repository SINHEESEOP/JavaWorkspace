package quiz09;

public class Main {

    public static void main(String[] args) {

        Circle c = new Circle("둥근이", 3);
        Rect r = new Rect("사각이",3);

        System.out.println(c.getArea());
        System.out.println(r.getArea());

    }

}
