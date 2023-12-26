package _01_day;

public class Operation {
    public static void main(String[] args) {


        int a = 5,      // 0000 0101
                b = 3;  // 0000 0011

        // 얄코 자바 영상 확인하고 정리하기
        System.out.println( a & b ); // 0000 0001 둘다 1이면 1, 아니면 0
        System.out.println( a | b ); // 0000 0111 둘중 하나만 1이면 1, 두 비트 모두 0이면 0.
        System.out.println( a ^ b ); // 0000 0001 두 비트가 다르면 1, 같으면 0.

        int c = 2;
        System.out.println(c << 1);

    }
}
