package chap_07;

public class _04_Constructor {
    public static void main(String[] args) {

        BlackBox b2 = new BlackBox("하양이", "UHD", 30000, "화이트");

        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
        System.out.println(b2); // ??

    }
}
