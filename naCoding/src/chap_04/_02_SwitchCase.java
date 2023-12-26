package chap_04;

public class _02_SwitchCase {
    public static void main(String[] args) {
        // 1,2등 전액, 3,4등 반액 이후 없음
        switch (5) {
            case 1,2:
                System.out.println("전액 장학금");
                break;
            case 3,4:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("아무고토 없쥬");
        }
    }
}
