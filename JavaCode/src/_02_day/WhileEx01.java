package day02;

public class WhileEx01 {

	public static void main(String[] args) {
		
		
		int a = 1; //1.제어변수 - 반복문의 횟수를 제어할 변수
		int sum = 0; //누적할 변수는 밖에 생성

		while(a <= 10) { //2. 제어변수로 조건을 생성

			sum += a; //sum = sum + a;
			
			a++; //3. 반복을 돌 때마다 제어변수를 증가해서 언제가는 조건이 false가 되게함
		}
		
		System.out.println("1-10의 합계:" + sum);
		
		
		
		/*
		 * int sum = 0; //누적할 변수
		 * sum = sum + 1;
		 * sum = sum + 2;
		 * sum = sum + 3;
		 * sum = sum + 4;
		 * sum = sum + 5;
		 * ....
		 * sum = sum + 10;
		 * 
		 */
		
		
		
		
		
		
		
		
		
	}
}
