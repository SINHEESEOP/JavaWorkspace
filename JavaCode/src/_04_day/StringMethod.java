package day04;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		//문자열 다루기 메서드
		
		//문자열 "ABC";
		String str = "ABC";
		char[] arr = {'A', 'B', 'C'};
		String str2 = new String(arr);

		System.out.println(str);
		System.out.println(str2);
		//문자열은 인덱스가 존재함 시작은 0
		
		//문자열 다루기 메서드 - 문자열.메서드명()
		//1. 문자열의 길이
		str = "안녕하세요~?";
		
		int result = str.length(); //반환을 잘보자~
		System.out.println("문자열길이:" + result);
		
		//2.인덱스 번호 위치를 잘라서 char형 반환
		char a = str.charAt(0); 
		System.out.println(a);
		
		//3.문자열 자르기 substring()
		String b = str.substring(3); //인덱스 미만 절삭
		System.out.println(b);
		
		String c = str.substring(0, 3); //0이상~3미만 추출
		System.out.println(c);
		
		//4.문자열 자르기 split()
		str = "010-1234-5678";

		String[] d = str.split("-"); //구분자 기분으로 잘라서 배열로 반환
		System.out.println( Arrays.toString(d) );

		//5.문자열 자르기 toCharArray()
		char[] e = str.toCharArray(); //한글자씩 잘라서 char배열로 반환
		System.out.println( Arrays.toString(e)  );
		
		//6.문자열 찾기 indexOf()
		System.out.println(str);
		
		int f = str.indexOf("2"); //가장 처음 발견된 index반환
		System.out.println("2를 찾은 위치:" + f);
		
		int g = str.indexOf("헐");
		System.out.println("없는 값이라면:" + g);
		
		//if(str.indexOf("헐") != -1) { //헐 문자열이 있음.
		//}
		int h = str.lastIndexOf("0"); //뒤에서부터 처음 발견된 index반환
		System.out.println("0을 뒤에서 부터 찾은위치:" + h);
		
		//7. 문자열 찾기 contains(), startWith()
		boolean i = str.contains("010");
		System.out.println("010의 포함여부:" + i );
		
		boolean j = str.startsWith("1234");
		System.out.println("1234로 문자열이 시작하는지 여부:" + j);
		
		//7. 문자열 치환 replace()
		str = "커피 중에 가장 맛있는 커피는 아이스 아메리카노 커피입니다";
		
		String k = str.replace("커피", "coffee"); //커피 -> coffee로 전부 변경
		System.out.println(k);
		
		String l = str.replaceFirst("커피", "coffee"); //가장 첫번째 커피를 coffee로 변경
		System.out.println(l);
		
		//모든 공백 없애기
		String m = str.replace(" ", "");
		System.out.println(m);
		
		//8. 양측 공백 삭제 trim()
		str = "  안녕하세요? 오늘은 화요일 입니다   ";
		String n = str.trim();
		System.out.println(n);
		
		//9. 대소문자 변경 toUpperCase(), toLowerCase()
		str = "aBcDeFg";
		String o = str.toUpperCase();
		System.out.println(o); //대문자로 변경
		
		String p = str.toLowerCase();
		System.out.println(p); //소문자로 변경
		
		//10. 문자열의 나열순서 비교. compareTo
		//각 자리의 글자 아스키코드값 비교를 해서, 문자열 대소비교
		System.out.println( "홍길동".compareTo("홍길동") ); //같으면 0 반환
		System.out.println( "홍길동".compareTo("홍길자") ); //음수가 나오면 앞 문자가 대상보다 사전적으로 빠름 
		System.out.println( "홍길자".compareTo("홍길동") ); //양수가 나오면 앞 문자가 대상보다 사전적으로 느림
		
		//11. 문자열을 구분자로 연결, join() - 스플릿의 반대
		String q = String.join("-", "hello", "world", "join", "만세");
		System.out.println(q);
		
		
		
		
		
		
		
	}
}
