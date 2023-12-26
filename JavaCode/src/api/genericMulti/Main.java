package api.genericMulti;

public class Main {

    public static void main(String[] args) {

        ABC<Integer, String> abc = new ABC<>();

        abc.setData(1, "홍길동");
        String name = abc.getValue(1);
    }

}
