package _01_day;

public class DataType {
    public static void main(String[] args) {
        // 2진수 - 0b 앞에
        // 8진수 - 0 앞에
        // 16진수 - 0x 앞에

        int a5 = 0b10; // 양수 2
        int a6 = 0110; // 8진수 형태로 저장
        int a7 = 0x10;
        System.out.println(a6);

        System.out.println("-------------------------------");

        float b1 = 3.141592F; // float은 F를 붙입니다. - 7자리 신뢰
        double b2 = 3.14159211122; // 15자리 신뢰

        System.out.println(b1);
        System.out.println(b2);

        b1 = 0.1f;
        b2 = 0.2;
        double a1 = b1 + b2;
        System.out.println(b1 + b2);

        b1 = 0.000314e4f; // XeY = 숫자 X를 10의Y승 만큼 곱 해준다.
        System.out.println(b1);

        /*
        양수 4를 2진법으로 표현 시 010
        음수 4를 2진법으로 표현시 010을 반전하여 101 + 1 = 110 이 된다. 맨 앞 숫자는 양,음수를 나타내는 부호이다.
         */

        char a = '가';
        char b = 44032;
        char c = '\uAC00';
        char d = 'A';

        System.out.println(a + "-" + b + "-" + c); // 가-가-가
        System.out.println(1 + 'A');

        // 문자열
        String s1 = "hello";
        String s2 = "world";

        char h = '쀍';

        // 1bit = 0 과 1 두개의 값을 가질 수 있음
        // bit = 제곱, 즉 2bit = 2의2제곱, 16bit = 2^16 이다.
        // byte = 8bit, CPU가 좋아하는 최소 단위는 4byte = 32bit
        // 실수는 항상 정수 보다 큼 예) long(8byte) < float(4byte)



    }
}
