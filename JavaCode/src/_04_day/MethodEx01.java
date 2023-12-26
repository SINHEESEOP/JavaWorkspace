package _04_day;

public class MethodEx01 {

    static String randomStr() {
        double ran = Math.random();

        String str = "";
        if (ran > 0.66) {
            str = "야";
        } else if (ran > 0.33) {
            str = "임마";
        } else {
            str = "너";
        }

        return str;
    }


    public static void main(String[] args) {

        String reulst2 = randomStr();
        System.out.println(randomStr());

    }
}
