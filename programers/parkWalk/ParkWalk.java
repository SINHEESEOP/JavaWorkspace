package programers.parkWalk;

import java.util.Arrays;

public class ParkWalk {
    static int[] solution(String[] park, String[] routes) { // park 를 2차원 배열로 만듬

        String[][] arr2 = new String[park.length][park[0].length()]; // park 의 2차원 배열
        int[] dogArr = new int[2];
        int e = 0;
        int s = 0;
        int w = 0;
        int n = 0;

        for (int i = 0; i < park.length; i++) { // park 를 2차원 배열로 만드는 for 문
            for (int j = 0; j < park[i].length(); j++) {
                arr2[i][j] = "" + park[i].charAt(j);
            }
        }

        for (int i = 0; i < park.length; i++) { // S 의 위치 인덱스 값으로 추출하는 for 문
            for (int j = 0; j < park[i].length(); j++) {
                if (arr2[i][j].equals("S")) {
                    dogArr[0] = i; // 세로
                    dogArr[1] = j; // 가로
                }
            }
        }
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;

        for (int i = 0; i < routes.length; i++) {
            if (routes[i].contains("E")) {
                e = Integer.parseInt("" + routes[i].charAt(2));
                if (dogArr[1] + e < arr2[0].length) {
                    for (int j = dogArr[1]; j <= dogArr[1] + e; j++) {
                        if (arr2[dogArr[0]][j].equals("X")) {
                            c1++;
                        }
                    }
                    if (c1 == 0) {
                        arr2[dogArr[0]][dogArr[1]] = arr2[dogArr[0]][dogArr[1] + e];
                        dogArr[1] = dogArr[1] + e;
                    }
                }
            }
            if (routes[i].contains("S")) {
                s = Integer.parseInt("" + routes[i].charAt(2));
                if (dogArr[0] + s < arr2.length) {
                    for (int j = dogArr[0]; j < dogArr[0] + s; j++) {
                        if (arr2[j][dogArr[1]].equals("X")) {
                            c2++;
                        }
                    }
                    if (c2 == 0) {
                        arr2[dogArr[0]][1] = arr2[dogArr[0] + s][dogArr[1]];
                        dogArr[0] = dogArr[0] + s;
                    }
                }
            }
            if (routes[i].contains("W")) {
                w = Integer.parseInt("" + routes[i].charAt(2));
                if (dogArr[1] - w >= 0) {
                    for (int j = dogArr[1] - w; j < dogArr[1]; j++) {
                        if (arr2[dogArr[0]][j].equals("X")) {
                            c3++;
                        }
                    }
                    if (c3 == 0) {
                        arr2[dogArr[0]][dogArr[1]] = arr2[dogArr[0]][dogArr[1] - w];
                        dogArr[1] = dogArr[1] - w;
                    }
                }
                if (routes[i].contains("N")) {
                    n = Integer.parseInt("" + routes[i].charAt(2));
                    if (dogArr[0] - n >= 0) {
                        for (int j = dogArr[0] - n; j < dogArr[0]; j++) {
                            if (arr2[dogArr[j]][0].equals("X")) {
                                c4++;
                            }
                        }
                        if (c4 == 0) {
                            arr2[dogArr[0]][1] = arr2[dogArr[0] - n][dogArr[1]];
                            dogArr[0] = dogArr[1] - n;
                        }
                    }
                }
            }
        }
        return dogArr;
    }

    public static void main(String[] args) {
        String[] park = {"OOS","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};
        System.out.println(Arrays.toString(solution(park, routes)));
    }
}
