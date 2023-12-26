package quiz18;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import quiz17.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz03 {

    public static void main(String[] args) throws Exception {

        //원본과제 - 파일을 읽어서 (날짜, 지점, 등급, 내용, 가격) 형태로 excel로 출력

        /*
         * 1. 건담.txt파일을 한줄씩 읽어 들입니다.
         * 2. Product객체(날짜, 지점, 등급, 내용, 가격) 을 가지는 생성을 합니다.
         * 3. 한 행에 대한 내용을 Product객체에 담고, 리스트에 담는다.
         *
         */
        List<Product> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> line = new ArrayList<>();

        String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\건담.txt";
        BufferedReader bReader = new BufferedReader(new FileReader(path));

        String[] pattern = {"[0-9]+-[0-9]+-[0-9]+", "[가-힣]+\\s[가-힣]+점?" ,"\\[[A-Z가-힣]+\\]", "]\\s[^원\\++]+\\s", "[0-9]+,?[0-9]+\\원"};


        int cnt = 0;
        String line2;
        while ((line2 = bReader.readLine()) != null) {
            line.add(line2);
        }

        for (String s : line) {
            for (String pa : pattern) {
                Matcher mss = Pattern.compile(pa).matcher(s);
                if (mss.find()) {
                    System.out.println(mss.group());
                }
            }
            System.out.println("--------------------------");
        }

        System.out.println(line);

        Workbook workbook = new XSSFWorkbook();



    }


}
