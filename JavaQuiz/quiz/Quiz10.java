package quiz;

public class Quiz10 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) { //  행, 세
            for (int j = 0; j < 5; j++) { // 가, 열
                if (i == 1 || i == 2) {
                    j += 4;
                    System.out.print("*   *");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 선생님 풀이
        System.out.println("--------------------------------------------");

        for(int i = 1; i <= 4; i++) { //열

            for(int j = 1; j <= 5; j++) { //행(출력)
                if(i == 1 || i == 4 || j == 1 || j == 5 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}