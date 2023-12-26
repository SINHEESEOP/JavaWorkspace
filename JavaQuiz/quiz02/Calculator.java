package quiz02;

public class Calculator {

    String quality;

    Calculator () {
        quality = "플라스틱";
    }

    Calculator (String quality) {
    }

    int sum(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
    int minus(int a, int b){
        System.out.println(a - b);
        return a - b;
    }
    int multiplication(int a, int b) {
        System.out.println(a * b);
        return a * b;
    }
}
