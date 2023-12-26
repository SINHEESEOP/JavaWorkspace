package chap_04;

public class _06_Break {
    public static void main(String[] args) {
        // Break
        // 치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)

        // for 문
        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " 번 손님 주문하신 치킨 나옴.");
            if (i == max) {
                System.out.println("금일 재료 소진");
                break; // break 를 만나면 바로 반복문 탈출함
            }
        }
        System.out.println("영업 시마이다");
        System.out.println("\n");

        // while 문
        int index = 1; // 손님 대기 번호
        while (index <= 50) {
            System.out.println(index + " 번 손님, 주문한 치킨 나옴");
            if (index == max) {
                System.out.println(" 금일 재료 소진");
                break;
            }
            index++;
        }
        System.out.println("영업 종료");
    }
}
