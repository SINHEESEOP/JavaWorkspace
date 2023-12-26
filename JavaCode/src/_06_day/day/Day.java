package _06_day.day;

public class Day {

    private int month;
    private int year;
    private String ssn;

    void setMonth(int month) {
        if (!(1 <= month && month <= 12)) {
            System.out.println("잘못된 값 입니다.");
            return;
        }
        this.month = month;
    }

    public int getMonth() {
        return this.month;
    }

    public void setYear(int year) {
        if (!(1950 <= year && 2023 >= year)) {
            System.out.println("잘못된 값 입니다.");
            return;
        }
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setSsn(String ssn) {
        ssn = ssn.replace("-", "");
        if (!(ssn.length() == 13)) {
            System.out.println("잘못된 값 입니다.");
        }
        this.ssn = ssn;
    }

    public String getSsn() {
        return this.ssn;
    }
}
