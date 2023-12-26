package programers.theCurseNumber3;

public class TheCurseNumber3 {

    public static int solution(int n) {
        int answer = 0;
        int cnt = 0;
        String a = "";
        for (int i = 1; i <= n*n; i++) {
            a = i + "";
            if (i % 3 == 0) {
                continue;
            } else if (a.contains("3")){
                continue;
            }
            cnt++;
            if (n == cnt) {
                answer = i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(10000));
    }
}
