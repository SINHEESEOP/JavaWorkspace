package quiz16;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * 연화가 입사한 회사에서는 매일 오전 7시에 연계사에서 
		 * 날짜유형의 csv파일을 전송을 해줍니다.
		 * 
		 * ex) 2023_11_24_data.csv 유형의 파일입니다
		 * 
		 * 그래서 연화는 매일 아침마다 csv파일을 읽어서 데이터베이스에 저장하는
		 * 프로그램 코드를 만들어야 합니다.
		 * 
		 * 1. buffered를 사용해서 날짜_data.csv파일을 읽어서 한줄 한줄씩 출력해주세요. 
		 */
		Date date = new Date();
		List<Data> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
		String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\" + sdf.format(date) + "_data.csv";

		BufferedReader bReader = null;
		try {
			bReader = new BufferedReader( new FileReader(path) );
			String line;
			while ((line = bReader.readLine()) != null){
				list.add( new Data ( line.split(",") ) );
			}

			bReader.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		for (Data d : list) {
			System.out.println(d.toString());
		}

	}
}
