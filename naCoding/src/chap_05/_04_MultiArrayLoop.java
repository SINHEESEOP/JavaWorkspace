package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"},
        };

        for (int i = 0; i < 3; i++) { // 세로
            for (int j = 0; j < 5; j++) { // 가로
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"},
        };

        for (int i = 0; i < seats2.length; i++) { // 세로
            for (int j = 0; j < seats2[i].length; j++) { // 가로
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        // 세로 크기 10 x 가로 크기 15에 해당하는 영화관 좌석

        String[][] seats3 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};

        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) { // 가로
                seats3[i][j] = eng[i] + (j + 1);
            // seats3 배열 i(2차원 배열)에 eng i(1차원 배열)를 순회하여 넣음
            // 동시에 1차원 i 배열(가로) 문자 + 숫자를 합하여 넣어줌
            // 간단 예시) 첫 반복에 seats[0][0] = eng[A] + (1)
                   //  둘빼 반복에 seats[0][1] = eng[A] + (2)
            }
        }


        // 표구매
        seats3[7][8] = "__";
        seats3[7][9] = "___";

        // 영화관 좌석 번호 확인

        for (int i = 0; i < seats3.length; i++) { // 세로길이, 2차원 배열의 길이.
            for (int j = 0; j < seats3[i].length; j++) { // 가로, seats[i].length = 각각의 줄에 해당하는 길이
                                                        // 2차원 배열의 각각에 1차원 배열의 길이
                System.out.print(seats3[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
