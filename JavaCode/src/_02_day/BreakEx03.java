package _02_day;

public class BreakEx03 {
    public static void main(String[] args) {

        //이름붙여 탈출하기(중첩반복문 에서)
        boolean bool = false;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.println(i + "-" + j);
                if(j == 5) {
                    bool = true;
                    i += 10;
                    j += 10;
                }
            }

            if (bool) break;
        }

        System.out.println("------------------------------------");

        abc:for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println( i + " - " + j);

                if (j == 5) {
                    break abc;
                }

            }

        }



    }
}
