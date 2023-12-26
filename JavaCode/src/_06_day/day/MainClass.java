package _06_day.day;

public class MainClass {

    public static void main(String[] args) {
        Day me = new Day();

        me.setMonth(3);
        me.setYear(2022);
        me.setSsn("980111-11111111");

        // 값의 사용
        int year = me.getYear();
        int month = me.getMonth();
        String ssn = me.getSsn();

        System.out.println(year + " " + month + " " + ssn);
    }

}
