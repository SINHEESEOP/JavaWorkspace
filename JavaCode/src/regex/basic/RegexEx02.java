package regex.basic;

public class RegexEx02 {

	public static void main(String[] args) {
		
		//주민번호 패턴을 찾아서 마스킹처리하기
		String info = "홍길당,30세,강남구,123123-1231231";
		
		String pattern = "[0-9]{6}-[0-9]{7}";
		
		//매개변수가 regex인 메서드는 정규표현식 패턴을 적용할 수 있다는 의미입니다
		String result = info.replaceAll(pattern, "******-*******");
		System.out.println(result);


		
	}
}
