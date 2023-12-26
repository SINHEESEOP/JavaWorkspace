package _10_day.exception.throws_;

public class ThorwEx01 {
    public static void main(String[] args) {
        /*
            throw - 예외 강제로 발생시키기
            메서드나 생성자에서 throw new 예외클래스()
            를 만나면 예외가 생성됩니다.

            throw 특정조건과 함께 catch 문장으로 프로그램 실행을 옴길 때 사용가능합니다.
         */
        int result = 0;

        try {
            result = calc(-10);
        } catch (Exception e) {
            throw new RuntimeException(e);
//             System.out.println(e.getMessage());
//            e.printStackTrace(); // 예외 원인을 찾을 때, 개발시에 매번 사용됩니다.
        }
        System.out.println(result);
    }

    public static int calc(int n) throws Exception {
        // 음수가 넘어오면 메소드 실행할 필요도 없이 강제 종료
        if (n < 0) {
            throw new Exception();
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

}
