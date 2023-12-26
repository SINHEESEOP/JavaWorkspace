package day02;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		//switch문장은 else if문장과 90% 유사합니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수입력>");
		int point = scan.nextInt();

		String grade; //
		
		
		switch (point / 10) { //변수의 연산식
		
		case 9: //90~99
			
			if(point >= 95) {
				grade = "A++학점";
			} else {
				grade = "A학점";
			}
			
			break;
		case 8: //80~89
			
			grade = "B학점";
			break;
		case 7:
			
			grade = "C학점";
			break;
		case 6:
			
			grade = "D학점";
			break;

		default:
			grade = "F학점";
			break;
		} 
		
		
		System.out.println("당신의 학점은 " + grade + "입니다");


		esc:for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (j == 6) break esc;
			}
		}
		
		
		
		
		
	}
}
