package quiz18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		
		//가격형식만 찾아서 순서대로 출력
		String str = "헠4,500원 크크크 1,245원?? 6000원엨 12,000,000,000원 1원";
		Matcher m = Pattern.compile("\\d{1,1000}(,\\d{3})*원").matcher(str);

		while(m.find()) {
			System.out.println(m.group());
		}
		
	}
}
