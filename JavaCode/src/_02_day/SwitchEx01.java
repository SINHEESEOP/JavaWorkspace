package day02;

public class SwitchEx01 {

	public static void main(String[] args) {
		
		int a = 10;
		
		switch( a ) { //()는 변수나 변수의 연산식 등이 들어갑니다 (실수 x)
		
		case 0:
		case 1:
			System.out.println("1번 실행");
			break; //switch문장을 빠져나옴
		case 2:
			System.out.println("2번 실행");
			break;
		case 3:
			System.out.println("3번 실행");
			break;
		case 4:
			System.out.println("4번 실행");
			break;
		
		default :	
			System.out.println("case에 매칭되는 값이 없습니다");
			break;
		}
		
		
		
		
	}
}
