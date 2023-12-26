import java.util.Scanner;

public class BackJun_2566 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        int max = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max <= arr[i][j]) {
                    // 25번 줄에 <= 가 아닌 < 를 넣어줄 경우 모든 값이 0으로 들어갈 경우
                    // 문제의 조건 중 큰 값이 중복값의 경우 랜덤적으로 행과 열 값을 출력해주지 못함.
                    // 말 그대로 값0, 행0, 열0 이 출력되기 때문에
                    max = arr[i][j];
                    b = i + 1;
                    c = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.print(b + " " + c);
    }
}