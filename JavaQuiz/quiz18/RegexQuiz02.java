package quiz18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		String str = "123123-45644 GS25치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(갓혜자도시락) 6,000";

		String[] strArr = {str,str2,str3};
		String[] m = {"\\d{6}-\\d{4,}", "GS|GS25", "\\(?[가-힣]+\\)?", "[0-9+,*]+,[0-9]{0,}원*"};

		//상품번호, GS25, (상품명), 가격 분리해서 출력.
		//1줄에대해서 패턴이 4개 나오고, 문자열을 각각 처리하는 반복 (중첩반복)

		for (String s : strArr) {

			for (String ms : m) {
				Matcher mss = Pattern.compile(ms).matcher(s);

				if (mss.find()) {
					System.out.println(mss.group());
				}

			}

			System.out.println("-----------------");
		}


	}
}
