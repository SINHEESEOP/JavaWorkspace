package day02;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		
		//점수를 입력받음
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("점수입력>");
		int point = scan.nextInt();
		
		//A, B, C, D, F
		String grade;
		
		if(point >= 90) {
			//grade = "A학점";
			//조건을 하나더
			if(point >= 95) {
				grade = "A++학점";
			} else { //90 <= x < 95
				grade = "A학점";
			}
			
		} else if(point >= 80) {
			grade = "B학점";
		} else if(point >= 70) {
			grade = "C학점";			
		} else if(point >= 60) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		
		System.out.println("당신의 학점은 " + grade + "인데요?");
		
		

		
		
		
		
		
	}
}
