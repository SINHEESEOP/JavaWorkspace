package api.util.token;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {

		//StringTokenizer클래스 (split보다 더 다양한 문자열 자르기 제공)

		String str1 = "오늘 날씨는 맑고, 매우 추워요";

		StringTokenizer token = new StringTokenizer(str1);

		System.out.println("잘린 문자개수:" + token.countTokens() );

		//사용법 - 반복자개념을 사용합니다.
//		System.out.println(token.nextToken() );
//		System.out.println(token.nextToken() );
//		System.out.println(token.nextToken() );
//		System.out.println(token.nextToken() );
//		System.out.println(token.nextToken() );
		//System.out.println(token.nextToken() );

		//다음 토큰이 있는지 없는지? 확인하는 메서드
		while( token.hasMoreTokens() ) {
			System.out.println(token.nextToken() );
		}


	}
}
