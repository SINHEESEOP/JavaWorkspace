package quiz03;

public class Computer extends Calculater {
    @Override
    public double circle(int r) {
        return Math.PI * r * r;
    }
   public double rect (double d) {
        return d * d;
    }
    public double rect (double d, double a) {
        return d * a;
    }
    public double rect (double d, double a, double c) {
        return d * a * c;
    }
}
