package quiz03;

public class Calculater {
    int result = 0;
    double pi = 3.14159;

    public int add(int result) {
        this.result += result;
        return this.result;
    }
    public double circle(int r) {
        return pi * r * r;
    }
}
