package programers.babbling;

public class 연습장 {
    public static void main(String[] args) {
        String a = "안녕하세요";

        String b = a.replace("안녕", "1");
        System.out.println(b);

        if (a.contains("안") && a.contains("녕") && a.contains("1")) {
            System.out.println("되네?");
        } else {
            System.out.println("1은 없는데?");
        }

        if (a.contains("안") || a.contains("녕") || a.contains("1")) {
            System.out.println("음?");
        }

    }
}
