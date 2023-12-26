package api.util.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokneEx02 {

	public static void main(String[] args) {
		
		String log = "2023/11/21";
		
		StringTokenizer token = new StringTokenizer(log, "/"); //  "/" 기준으로 자름
		
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}

		System.out.println("-----------------------------------------------------");
		String log2 = "2023.11.21, 화요일, 홍길동, 010-1234-5678";

		StringTokenizer token2 = new StringTokenizer(log2, ",.- ");

		while (token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}

		System.out.println("====================================================");

		StringTokenizer token3 = new StringTokenizer(log2,",", true);
		while (token3.hasMoreTokens()) {
			System.out.println(token3.nextToken());
		}

	}
}
