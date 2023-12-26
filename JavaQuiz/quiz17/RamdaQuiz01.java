package quiz17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class RamdaQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 오늘날짜_data.csv파일을 읽어들입니다.
		 * 2. 각각의 행데이터를 Data클래스에 저장하고 List에 추가합니다.
		 * 3. 각 데이터들 중에서 나이가 30세 이상이거나, 지역이 서울이 포함된 데이터만 추출
		 * 
		 */

		Date date = new Date();
		List<Data> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd");
		String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\" + sdf.format(date) + "_data.csv";

		try {
			BufferedReader bReader = new BufferedReader( new FileReader(path) );
			String line;
			while ((line = bReader.readLine()) != null){
				list.add( new Data( line.replace(" ","").split(",") ) );
			}

			bReader.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		List<Data> newList = list.stream()
				.filter( a -> a.getAge() >= 30 || a.getArea().contains("서울") )
				.collect( Collectors.toList() );

		System.out.println(newList.toString());
	}

	
}
