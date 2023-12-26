package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {

        // 완전 잘못된 코드임. 볼 때 마다 이유를 생각하셈 답지 보지말고.
        int[] size = new int[10];
        int b = 250;
        for (int i = 0; i < size.length; i++) {
            System.out.println(" 사이즈" + b + " (재고있음)");
            b += 5;
        }

        // 추가로 반복문에 a(5) += 5; 는 5씩 늘지만 a = 5 + 5; 는 10 을 계속 넣음.

        System.out.println("\n");

        int[] sizeArray = new int[10];
        //int c = 245;
        for (int i = 0; i < sizeArray.length; i++) {
            //sizeArray[i] = c += 5;
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size1 : sizeArray) {
            System.out.println("사이즈 " + size1 + " (재고있음)");
        }


        int a = 20;
        System.out.println(a);
    }
}
