package quiz11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        /*
            1. 스캐너를 통해서 정수 2개를 입력받고
            2. 입력받은 값이 정수라면, 두 정수의 합을 출력하고 반복문을 종료
            3. 입력받은 값이 에러를 발생시키면, "정수로만 입력하세요" 를 출력하고 다시 입력받습니다.
            4. 반복을 탈출하면 "프로그램 정상종료" 문장을 띄워주면 됩니다.
         */
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        while (true) {
            try {
                System.out.print("정수 1>");
                a = sc.nextInt();
                System.out.print("정수 2 >");
                b = sc.nextInt();
                System.out.println(a + b);
                break;
            } catch (InputMismatchException e) {
                System.out.println("정수로만 입력하세요");
                sc.next();
            }
        }
        System.out.println("프로그램 정상 종료");
    }


}
