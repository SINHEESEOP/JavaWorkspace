package _05_day.str_ex;

public class StringExample {
    public static void main(String[] args) {

        // 문자열은 참조타입이다.
        String str1 = "홍길동";
        String str2 = "홍길동";
        String Str3 = new String("홍길동");

        // "동일 메소드 안"에서 "동일 문자열" 선언하면, "동일한 주소"를 가르키게 됩니다.
        // 만약 "직접 String 객체 생성"을 하거나, "다른곳에서 넘어온 문자열"은 "다른 주소"를 가르키게 됩니다.

    }
}
