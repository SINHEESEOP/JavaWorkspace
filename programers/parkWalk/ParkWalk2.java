package programers.parkWalk;

import java.util.Arrays;

public class ParkWalk2 {

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        for (int i = 0; i < park.length; i++) { // S의 위치를 찾음
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].contains("S")) {
                    answer[0] = i;
                }
            }
        }

        for (int i = 0; i < routes.length; i++) {
            if (routes[i].contains("E")) {
                int e = Character.getNumericValue(routes[i].charAt(2));
                if (answer[1] + e < park[0].length() && !(park[answer[0]].substring(answer[1], answer[1] + e + 1).contains("X"))) {
                    answer[1] = answer[1] + e;
                }
            }
            if (routes[i].contains("W")) {
                int w = Character.getNumericValue(routes[i].charAt(2));
                if (answer[1] - w >= 0 && !(park[answer[0]].substring(answer[1] - w, answer[1]).contains("X"))) {
                    answer[1] = answer[1] - w;
                }
            }
            int cnt = 0;
            if (routes[i].contains("N")) {
                int n = Character.getNumericValue(routes[i].charAt(2));
                if (answer[0] - n >= 0) {
                    for (int j = answer[0] - n; j < answer[0]; j++) {
                        String a = "" + park[j].charAt(answer[1]);
                        if (a.equals("X")) {
                            cnt++;
                        }
                    }
                    if (cnt == 0) {
                        answer[0] = answer[0] - n;
                    }
                }
            }
            int cnt1 = 0;
            if (routes[i].contains("S")) {
                int s = Character.getNumericValue(routes[i].charAt(2));
                if (answer[0] + s < park.length) {
                    for (int j = answer[0]; j <= answer[0] + s; j++) {
                        String a = "" + park[j].charAt(answer[1]);
                        if (a.equals("X")) {
                            cnt1++;
                        }
                    }
                    if (cnt1 == 0) {
                        answer[0] = answer[0] + s;
                    }
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String[] park = {"SOOO","OOO","OOO","OOO"};
        String[] routes = {"E 3"};
        System.out.println(Arrays.toString(solution(park, routes)));
    }
}
