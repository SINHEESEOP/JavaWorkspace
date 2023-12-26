package chap_06;

public class _04_ParameterAndReturn {

    public static int getPower(int number) {
        int result = number * number;
        return result;
    }


    public static void main(String[] args) {

        // 전달값과 반환값이 있는 메소드
        int retval = getPower(2);
        System.out.println(retval);

    }
}
