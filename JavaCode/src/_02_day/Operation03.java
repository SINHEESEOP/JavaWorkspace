package _02_day;

public class Operation03 {
    public static void main(String[] args) {

        // 3항 연산식
        // 랜덤한 값을 만드는 기능

        // System.out.println( Math.random() ); // 0 이상 ~ 1 미만

        //double d = Math.random() * 10;
        int c = (int) Math.random() * 10; // 우선순위로 값이 0, (Math.random 을 int로 항변환 먼저 한 후 * 10)
        int d = (int) (Math.random() * 10); //
        System.out.println(d);

        System.out.println(d % 3 == 0 ? "3의 배수입니다" : "3의 배수가 아닙니다.");

        //변수에 삼함을 저장
        String s = d % 3 == 0 ? "3의 배수입니다" : "3의 배수가 아닙니다.";
        System.out.println(s);

        // Math.random() 이용해서 -5 ~ 5 까지 랜덤한 정수를 생성
        // 반드시 절대값만 나올 수 있도록 3항 연산식을 작성해보세요.

        int a = (int) (Math.random() * 11) - 5;
        System.out.println("절댓값 : " + (a < 0 ? a * -1 : a));


        // 이렇게도 되네.. 왜지??
        int b = (int)(-Math.random() * 6) | (int)(Math.random() * 6);

        // || or | 의 차이 = || 은 단축, | 는 단축하지 않음
    }
}
