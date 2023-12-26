package chap_04;

public class _05_NestedLoop_이중반복문 {
    public static void main(String[] args) {
        // 이중 반복문
        /*
        
        *****
        *****
        *****
        *****
        *****
        
        */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*"); 
            }
            System.out.println(); // 줄바꿈
        }

        System.out.println("\n");
        /*

        *
        **
        ***
        ****
        *****

         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

         *
         **
         ***
         ****
         *****

         */
        System.out.println("\n");

        int a = 4;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= a; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            a--;
            System.out.println();
        }

        System.out.println("\n");
        // 구구단 (multipleTable)
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    System.out.println(i + " 곱하기 " + j + "곱하기" +
                            k + " = " + i * j * k);
                }
            }
        }


    }
}
