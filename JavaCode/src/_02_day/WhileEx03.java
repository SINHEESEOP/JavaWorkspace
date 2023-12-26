package day02;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		
		//첫번째 줄에 정수가 입력이 들어옵니다.
		//입력받은 정수받은 정수만큼 다시한번 입력받음.
		//그리고 합을 구한다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력>");
		int a = scan.nextInt();
		
		int i = 1;
		int sum = 0; //x의 합계를 누적할 변수
		
		while(i <= a) {
			
			System.out.print(">");
			int x = scan.nextInt();
			sum += x; //입력받은 x의 합계
			
			i++;
		}
		
		System.out.println("입력받은 수들의 합:" + sum);
		
		
		
		
		
		
	}
}
