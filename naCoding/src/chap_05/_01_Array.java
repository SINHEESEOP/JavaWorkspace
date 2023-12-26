package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : "같은 자료형"의 값 여러 개를 저장하는 연속된 공간
        // 주의!: 배열은 괄호뒤 ; 를 붙여 줘야함

        // 배열 선언 첫 번째 방법
        String[] coffees1 = new String[4];

        // 두번째 방법
        String coffees2[] = new String[4];
//
//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        귀찮아..
        // 세번째 방법
        String coffees3[] = new String[] {"아메리카노", "카페모카"};

        // 네번째 방법
        String coffees4[] = {"아메리카노", "카페모카"};

        // 커피 주문
        System.out.println(coffees4[0]);

        // 다른 자료형?
        Integer[] i = new Integer[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        i[3] = 4;
        double[] d = new double[] {10.1, 10.2};
        boolean[] b = {false, true};

    }
}
