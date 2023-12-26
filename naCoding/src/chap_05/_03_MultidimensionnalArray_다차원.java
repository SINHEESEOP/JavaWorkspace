package chap_05;

public class _03_MultidimensionnalArray_다차원 {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 = C5

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};


        // 3(세로) x 5(가로) 크기의 2차원 배열
        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"},
        };

        // B2에 접근하려면?
        System.out.println(seats[1][1]);

        // 3차원 배열 만들기
        String[][][] mArray = {
                { {"1","2"}, {"A","B"}, {"!","@"} }, // 차원 배열 0번째
                { {"1차원배열 0번째"}, {"1차원배열 1번째"}, {"1차원배열 2번째"} }, // 2차원 배열 1번째
                { {}, {}, {} }, // 2차원 배열 2번째
                // 0차열 배열에 0차열 배열에 0번째 숫자 = 1
        };
        System.out.println(mArray[1][0][0]); // 3차원 1차열에서 2차원 0차열중 1차원 0차열
    }
}
