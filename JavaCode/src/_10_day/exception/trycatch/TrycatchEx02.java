package _10_day.exception.trycatch;

public class TrycatchEx02 {

    public static void main(String[] args) {
        String[] arr = {"홍길동", "이순신", "피카츄"};
        int i = 0;
        while (i < 5) {
            try {
                System.out.println(arr[i]);
            } catch (Exception e) {
                System.out.println("배열 범위를 벗어났습니다.");
            }
            i++;
        }
        System.out.println("프로그램 정상 종료");
    }
}
