package chap_04;

public class _04_While_DoWhile {
    public static void main(String[] args) {
        // for 문과 다르게 while 문은 명확한 반복 횟수가 없을때 사용
        // 수영장에서 수영을 하는 모습
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        // (move < distance) 해당 조건이 false 가 될 때 까지 반복하는 것.
        while (move < distance) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인  동안 반복 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3미터 이동
        }
        System.out.println("도차쿠");

        System.out.println("\n");

        int height = 2; // 키 2m
        move = 0;
        while (move + height <= distance) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인  동안 반복 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3미터 이동
        }
        System.out.println("도차쿠");

        System.out.println("\n");

        // 반복문 Do While
        do { // 일단 do! 한번은 do 안의 내용을 반복 후 while 을 실행.
            System.out.println("발차기 하는 중");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while ( move + height < distance );
        System.out.println("도차쿠");


    }
}
