package chap_06;

public class _05_OverLoading {

//    public static int powerExp(String strNumber, String strExponent) {
//        int number = Integer.parseInt(strNumber);
//        int number2 = Integer.parseInt(strExponent);
//        int result = 1;
//        for (int i = 0; i < number2; i++) {
//            result *= number;
//        }
//        // System.out.printf("%d의 %d승은 %d입니다.\n", number, exponent, result);
//        return result;
//    }

    public static int powerExp(String strNumber, String strExponent) {
       return powerExp(Integer.parseInt(strNumber), Integer.parseInt(strExponent));
    }

    public static int powerExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        // System.out.printf("%d의 %d승은 %d입니다.\n", number, exponent, result);
        return result;
    }

    public static void main(String[] args) {
        // 이름이 같은 메소드를 여러개 생성

        System.out.println(powerExp("2", "2"));

        // 전달 값이 달라서 변환 해줄 때.
        // 전달 받는 값의 개수가 달라서 추가해 줄 때 사용. (곱셉만하다 가 제곱식 할 때)
        // 반환 값 자체가 다른 메소드는 오버로딩이 불가.
    }
}