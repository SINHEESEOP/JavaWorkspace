package programers.coke;

public class SINHEESEOP {

    public static int solution(int a, int b, int n) {
        int n1 = n; // 남은 빈병
        int rCoke = 0; // 리턴 받은 콜라
        int rCoke2 = 0;
        int u = 0; // 총 콜라

        while (n1 >= a) {
            n1 -= a;
            rCoke++;
            rCoke += u;
        }

        while (rCoke >= a) {
            rCoke2 -= a;

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20));
        // a 는 조건 빈병
        // b 는 충족시 주는 콜라 수
        // n 은 상빈이가 가지고 있는 병수
    }

}
