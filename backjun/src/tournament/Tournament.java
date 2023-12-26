package tournament;

import java.util.Scanner;

public class Tournament {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//        int totalPeople = sc.nextInt();
        int jimin = sc.nextInt();
        int hansu = sc.nextInt();
        int jiminGroup = 0;
        int hansuGroup = 0;

        if (jimin % 2 == 0) { // 지민이 속한 그룹 구하는 공식
            jiminGroup = jimin / 2;
        } else {
            jiminGroup = (jimin + 1) / 2;
        }

        if (hansu % 2 == 0) { // 한수가 속한 그룹 구하는 공식
            hansuGroup = hansu / 2;
        } else {
            hansuGroup = (hansu + 1) / 2;
        }

        int matching = 0; // 둘이 매칭이 되기 위해 치뤄야 할 라운드 수
        if (jiminGroup > hansuGroup) {
            matching = (jiminGroup - hansuGroup) / 2;
        } else if (jiminGroup == hansuGroup) {
            matching = 1;
        } else {
            matching = (hansuGroup - jiminGroup ) / 2;
        }




//        int cnt = 0;
//        for (int i = totalPeople; i > 1; i /= 2 ) { // 전체 인원에 대한 총 라운드수 구하는 공식
//            cnt++;
//        }
//        System.out.println(cnt);
//


        System.out.println(matching);




    }

}
