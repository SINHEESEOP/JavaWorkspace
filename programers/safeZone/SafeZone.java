package programers.safeZone;

public class SafeZone {
    static int solution(int[][] board) {
        int target = 2;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    if (0 < i && board[i-1][j] != 1) { // 타겟 위
                        board[i-1][j] = target;
                    }
                    if (i < board.length - 1 && board[i+1][j] != 1) { // 타켓 아래
                        board[i+1][j] = target;
                    }
                    if (0 < j && board[i][j-1] != 1) { // 왼쪽
                        board[i][j-1] = target;
                    }
                    if (j < board[i].length - 1 && board[i][j+1] != 1) { // 오른쪽
                        board[i][j+1] = target;
                    }
                    if (0 < i && 0 < j && board[i-1][j-1] != 1) { // 위 왼쪽
                        board[i-1][j-1] = target;
                    }
                    if (0 < i && j < board[i].length - 1 && board[i-1][j+1] != 1) { // 위 오른쪽
                        board[i-1][j+1] = target;
                    }
                    if (i < board.length - 1 && 0 < j && board[i+1][j-1] != 1) { //  아래 왼쪽
                        board[i+1][j-1] = target;
                    }
                    if (i < board.length - 1 && j < board[i].length - 1 && board[i+1][j+1] != 1) { // 아래 오른쪽
                        board[i+1][j+1] = target;
                    }
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        System.out.println(solution(arr));
    }
}
