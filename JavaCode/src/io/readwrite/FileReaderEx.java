package io.readwrite;

import java.io.FileReader;
import java.io.InputStream;

public class FileReaderEx {


//	 아니 어떻게 인풋스트림 클래스 정적 변수인 in 이 System 필드변수로 사용됨? 어떻게??

	public static void main(String[] args) {
		
		/*
		 * 1. 2byte기반으로 파일을 읽어들이는 클래스 FileReader
		 * 2. 한글(문자) 형태의 파일데이터를 읽기에 적합합니다.
		 * 3. Reader클래스를 상속받습니다.
		 */

		String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\copy\\copytest2.txt";
		String str = "";
		try {
			FileReader fr = new FileReader(path);

			int result;
			while( (result = fr.read() ) != -1  ) { //한글자를 읽고, 더이상 읽을게 없다면 -1반환
//				System.out.println(result);
				str += (char)result;
			}
			System.out.println(str);
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		

	}
}
