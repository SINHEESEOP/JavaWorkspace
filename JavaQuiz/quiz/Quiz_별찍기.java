package quiz;

public class Quiz_별찍기 {
    public static void main(String[] args) {


        //  for문 안에 for문을 두개 쓰는 것과
        //  3중 for문의 차이로 동작 원리 이해하기

        /*
         *  1. 별찍기 트리는 for 문 안에 for 문을 두개 써야함
         *  2. 3중 for 문이 아님.
         *
         *  1. for 문에 2중 for 문을 사용 시, 내부 포문을 순서대로 실행 후 바로 바깥 포문을 실행하지만
         *  2. 3중 포문은 2번째 3번째에서 계속 돌다가 2번째 for 의 반복이 다 끝나야 1번째 for문이 돌아요.
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
