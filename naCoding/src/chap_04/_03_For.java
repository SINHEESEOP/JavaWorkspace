package chap_04;

public class _03_For {
    public static void main(String[] args) {
        // for 문은 명확한 반복 횟수가 있을때 사용

        // 짝수만 출력
        System.out.println("방법1");
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i);
        } System.out.println("\n");

        System.out.println("방법2");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.print(i);
        }

        System.out.println("\n");

        // 1부터 10까지 수들의 합
        var sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
