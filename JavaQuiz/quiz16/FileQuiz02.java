package quiz16;

import java.io.FileWriter;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. 파일명을 입력받습니다.
		 * 2. 사용자가 그만을 입력할 때까지, 작성할 내용을 입력받습니다.
		 * 3. 사용자가 그만을 입력했다면, 마지막에 단 1번으로 파일을 써내립니다.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
//		String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\FileQuiz02.txt";

		System.out.print("생성할 파일명 입력해주세요 >");
		String name = sc.nextLine();
		String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\" + name;
		try {

			//FileWriter fw = new FileWriter(path);
			FileWriter fw = new FileWriter(path, true); //기존파일에 내용을 추가함
			// 윈 10 이상 부터 캐리지 리턴 기본으로 넣어줘서 \r 넣으면 줄바꿈 처리 해버려서 두칸 뛰운다.
//			String str = "아 쉬는시간이네?\n\r 집에가고싶다"; // \r캐리지리턴
			boolean bool = true;

			String str = "";
			while (bool) {
				String a = sc.nextLine();
				if (!(a.equals("그만"))) {
					str += a + "\n";
				} else if (a.equals("그만")) {
					bool = false;
				}
			}
			fw.write(str);
			fw.close();

			System.out.println("파일생성완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
