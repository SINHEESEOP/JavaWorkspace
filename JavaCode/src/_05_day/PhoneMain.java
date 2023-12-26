package _05_day;

public class PhoneMain {
    public static void main(String[] args) {
        Phone samSung = new Phone();

        samSung.info();

        Phone apple = new Phone("iPhone");
        apple.info();

        Phone apple2 = new Phone("iPhone", 2000000);
        apple2.info();

        Phone apple3 = new Phone("IPhone Pro15", 200,"spaceblack");
        apple3.info();
    }
}
