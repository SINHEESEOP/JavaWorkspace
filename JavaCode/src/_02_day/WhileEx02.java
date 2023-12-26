package day02;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		
		//어떤 수가 소수 인지 판별하는 간단한방법.
		//소수 = 나누어 떨어지는 수가 1또는 자기자신인 수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("소수인지 판별할 수 입력>");
 		int n = scan.nextInt();
		
 		
 		//시작할 수를 2
 		int a = 2;
 		while( n % a != 0 ) {
 			
 			System.out.println(a);
 			
 			a++; 
 		}
 		
 		//n이 5일 경우 a는 몇까지 증가? 5
 		//n이 6일 경우 a는 2
 		if(n == a) {
 			System.out.println(n + "은 소수 입니다");
 		} else {
 			System.out.println(n + "은 소수가 아닙니다");
 		}
 		
 		
 		System.out.println("-----------------------------------------");
 		
 		//소수인지 판별하는 2번쨰 방법 - 2부터~자기 자신까지 나누면서 약수의 개수를 센다.
 		int i = 2;
 		
 		int cnt = 0; //약수의 개수를 셀 변수
 		
 		while( i <= n ) {
 			//나누어 떨어지는 수의 개수를 셈
 			if(n % i == 0) { //i는 n의 약수
 				cnt++; //카운트를 증가 시킴
 			}
 			i++;
 		}
 		
 		if(cnt == 1) {
 			System.out.println(n + "은 소수 입니다");
 		} else {
 			System.out.println(n + "은 소수가 아닙니다");
 		}
 		
 		
 		
 		
 		
 		
 		
 		
 		
	}
}
