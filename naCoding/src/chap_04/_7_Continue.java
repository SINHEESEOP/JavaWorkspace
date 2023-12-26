package chap_04;

public class _7_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 노쇼
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " 번 손님 주문한 치킨 나옴");

            // 손님이 없다면? (noShow)
            if (i == noShow) {
                System.out.println(i + "노쇼함 다음 손님 줌");
                continue; // 말 그대로 건너뛰기, 탈출이 아닌
            }
            sold++; // 판매처리
            if (sold == max) {
                System.out.println("재료 소진 주문 마감, 유감");
                break;
            }
        }
        System.out.println("금일 시마이");

        // while 문으로 만들기
        sold = 0; // 판매 개수
        int index = 1; // 손님 대기 번호
        // while (index <= 50) {
        while (true) { // true 를 넣으면 무한 반복이지만, 반복문 안에 break(탈출)이 있으므로 가능
            // index++; 밑 인덱스 지우고 여기다가 하나만 넣어도 가능.
            System.out.println(index + " 번 손님 주문 치킨 나옴");
            if (index == noShow) {
                System.out.println(index + " 노쇼 생퀴");
                index++;
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("다 팔려또");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
