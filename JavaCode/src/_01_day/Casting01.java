package _01_day;

public class Casting01 {
    public static void main(String[] args) {
        // 8bit 로는 2^7승 까지 표현 가능. 하지만 음수도 표현 해야함 그렇다면? [1]000 0000 이렇게 쪼개야함
        // byte = -128 ~ 127 즉 [1]000 0000 ~ [0]111 1111 임
        // 그렇다면 256 = 1 0000 0000 = 8비트(byte)에 넣으면,
        // = 1을 날리고 0은 부호비트 뒤에 숫자를 사용 = 1 [0]000 0000 이 되서 양수 0이 됨
        // 여기서 1000 0000인 양수를 넣으면
        int a = 257;
        byte b = (byte) a;

        // 타입이 다른 경우도 명시적 형 변환을 해야함.
        char cc = '뷁';
        byte cb = (byte)cc;
        int cf = cc;

        // 서로 다른 타읩의 연산 에서는 큰 타입에 맞추어 자동 형변환 된다.
        // 단 Long + float 경우 실제로 큰건 long 이지만 float 으로 변환됨
        // 이유는 소수점을 다 버려 버리면 안되니까... 해당 경우만 논외다.

        // int + char = int 다.
        // int 형보다 작은 타입의 연산은 무조건 int가 된다.
        // byte 10 + byte 10 = int 20 이 된다.

        byte ac = 1;
        System.out.println('A' + ac); // 은 왜 75 인가?

        int i = -3;
        int j = -i; // +3

        byte bc = 10; // 0000 1010
        System.out.println(~bc); // 1111 0101 0 이 1이다. = -10

        long l = 90000000000000000l;
        float f = l;

    }
}
