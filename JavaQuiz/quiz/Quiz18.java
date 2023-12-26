package quiz;
public class Quiz18 {
    static int sum(int n) {
        int x = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) x += i;
        }
        return x;
    }
    static int sum2(int a, int b) {
        int sum = 0;
//        항상 if 문은 3항으로 가능하다.
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        return sum;
    }
    static String park(int a) {
        String str = "";
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                str += "자";
            } else {
                str += "바";
            }
        }
        return str;
    }
    public static void main(String[] args) {
        // 1. 매개변수 n을 받아서, n까지 약수의 합을 리턴하는 sum() 생성
        // 2. 두 수를 매개변수로 받아서, 두 수 사이의 합 리턴 sum2() 생성
        //  - 두 수의 크기는 정해지지 않음
        //  - sum2(1, 10);
        //  - sum2(10, 1);

        System.out.println(sum(7));
        System.out.println(sum2(1,10));
        System.out.println(sum2(10,1));
        System.out.println(park(10));

    }
}
