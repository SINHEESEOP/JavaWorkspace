package _02_day;

import java.util.Scanner;

public class If_ElseIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        String grade;
        if (point >= 90) {
            grade = "A학점";
        } else if (point >= 80) {
            grade = "B학점";
        } else if (point >= 70) {
            grade = "C학점";
        } else if (point >= 60) {
            grade = "D학점";
        } else if (point >= 50) {
            grade = "E학점";
        } else {
            grade = "F 학점";
        }
        System.out.println(grade);

    }
}
