package quiz07;

public class MainClass {
    public static void main(String[] args) {
        MyCart myCart = new MyCart(30000);
        Computer computer = new Computer();
        Radio radio = new Radio();
        Tv tv = new Tv();

        myCart.buy(new Tv()); // 이렇게도 가능 일회성.
        myCart.buy(tv);
        myCart.buy(tv);
        myCart.buy(tv);
        myCart.buy(tv);
        myCart.buy(tv);
        myCart.buy(tv);
        myCart.buy(tv);
        myCart.buy(tv);
        myCart.buy(tv);
        myCart.buy(tv);
        myCart.info();
    }
}
