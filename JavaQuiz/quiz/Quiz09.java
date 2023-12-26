package quiz;

public class Quiz09 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i+=3) { // 세로
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " x " + j + " = " + i * j + "\t");

                System.out.print(i+1 + " x " + j + " = " + i * j + "\t");

                System.out.println(i+2 + " x " + j + " = " + i * j + "\t");
            }
            System.out.println("\n");
        }
    }
}