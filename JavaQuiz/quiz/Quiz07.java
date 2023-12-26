package quiz;

public class Quiz07 {
    public static void main(String[] args) {

        // 1. 7 ~ 100 까지 정수들에서 7의 배수를 가로로 출력
        System.out.println("1번 문제");
        for (int i = 7; i <= 100 ; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        } System.out.println();

        // 2. 50 ~ 100 까지 두 수 사이의 합계 출력
        System.out.println("2번 문제");
        int sum = 0;
        for (int i = 50; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 3. 200 까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수 출력
        System.out.println("3번 문제");
        for (int i = 0; i <= 200; i++) {
            if (i % 4 == 0 && i % 8 != 0) {
                System.out.print(i + " ");
            }
        } System.out.println();

        // 4. ABCDEF....Z를 붙여서 출력
        System.out.println("4번 문제");
        for (int i = 65; i <= 90; i++) {
            char a = (char) i;
            System.out.print(a + " ");
        }
        System.out.println();
        // 4 - 1.
        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.print(a);
        }
        System.out.println();
        // 4 - 2.
        String str = "";
        for (char i = 'A'; i <= 'Z'; i++) {
            str += i;
        }
        System.out.println(str);

        // 배열의 요소중에서 짝수의 합계 > 배열요소에 순서대로 접근 -> 짝수인지 확인해서 누적
        int[] arr = {23,54,34,23,22,20,30};

        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum1 += arr[i];
            }
        }
        System.out.println(sum1);

    }
}
