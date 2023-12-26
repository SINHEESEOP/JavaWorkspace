package io.readwrite;

import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) {
		
		/*
		 * 1. 문자(한글)를 써서 저장할 때 사용하는 클래스는 FileWriter클래스 입니다.
		 * 2. 2byte단위로 문자를 씁니다
		 * 3. Writer클래스를 상속받습니다.
		 * 4. 비디오 or 오디오 같은 파일을 쓰기에는 적합하지 않습니다.
		 */
		
		
		String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\test2.txt";
		
		try {
			
			//FileWriter fw = new FileWriter(path);
			FileWriter fw = new FileWriter(path, true); //기존파일에 내용을 추가함
			// 윈 10 이상 부터 캐리지 리턴 기본으로 넣어줘서 \r 넣으면 줄바꿈 처리 해버려서 두칸 뛰운다.
			String str = "아 쉬는시간이네?\n\r 집에가고싶다"; // \r캐리지리턴
			fw.write(str);
			
			fw.close();
			
			System.out.println("파일생성완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}
