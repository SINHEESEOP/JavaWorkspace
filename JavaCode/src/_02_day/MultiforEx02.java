package _02_day;

public class MultiforEx02 {
    public static void main(String[] args) {
        // 바깥 반복 회전수에 따라서, 내부 반복의 횟수가 달라지는 경우

        // i = 1, j = 1바퀴;
        // i = 2, j = 2바퀴
        // i = 10, j = 10바퀴

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.println(i + " - " + j);
            }

        }
        System.out.println("------------------------");
        // 바깥 반복문 - 행(세), 내부반복문이 출력
        for (int i = 1; i <= 5; i ++) {

            for (int k = 1; k <= 6 - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
