package quiz18;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz03_T {

    public static void main(String[] args) {
        //원본과제 - 파일을 읽어서 (날짜, 지점, 등급, 내용, 가격) 형태로 excel로 출력
        /*
         * 1. 건담.txt파일을 한줄씩 읽어 들입니다.
         * 2. Product객체(날짜, 지점, 등급, 내용, 가격) 을 가지는 생성을 합니다.
         * 3. 한 행에 대한 내용을 Product객체에 담고, 리스트에 담는다.
         */

        String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\건담.txt";

        List<Product2> list = new ArrayList<>();


        try {

            BufferedReader br = new BufferedReader(new FileReader(path));

            String p1 = "\\d{8}-\\d{2}-\\d{12,13}"; //일련번호
            String p2 = "[건담]*[가-힣]+ [가-힣]+"; //지점
            String p3 = "\\[[가-힣A-Z]+\\]"; //등급
            String p4 = "[0-9+,*]+원"; //가격

            String str;
            while ((str = br.readLine()) != null) {

                Matcher m1 = Pattern.compile(p1).matcher(str);
                Matcher m2 = Pattern.compile(p2).matcher(str);
                Matcher m3 = Pattern.compile(p3).matcher(str);
                Matcher m4 = Pattern.compile(p4).matcher(str);

                if (m1.find() && m2.find() && m3.find() && m4.find()) {

                    String num = m1.group();
                    String store = m2.group();
                    String grade = m3.group();
                    String price = m4.group();
                    //m3의 끝, m4의 처음
                    String detail = str.substring(m3.end(), m4.start()).trim();

                    //객체에 담고, 리스트에 추가한다.
                    Product2 prod = new Product2(num, store, grade, price, detail);
                    list.add(prod);

                }

                System.out.println("-----------------------");
            } //end while

            br.close();


            //엑셀생성
            createExcel(list);

        } catch (Exception e) {
            e.printStackTrace();
        }

    } //end main


    public static void createExcel(List<Product2> list) {

        Workbook w = new XSSFWorkbook();
        //시트 생성
        Sheet s = w.createSheet("sheet1");

        for (int i = 0; i < list.size(); i++) {

            Row r = s.createRow(i); //

            r.createCell(0).setCellValue(list.get(i).getNum());
            r.createCell(1).setCellValue(list.get(i).getGrade());
            r.createCell(2).setCellValue(list.get(i).getStore());
            r.createCell(3).setCellValue(list.get(i).getPrice());
            r.createCell(4).setCellValue(list.get(i).getDetail());
        }

//			행 생성
        Row r = s.createRow(0);

        Cell c = r.createCell(0);
        c.setCellValue("일련번호");

        Cell c2 = r.createCell(1);
        c2.setCellValue("지점");

        Cell c3 = r.createCell(2);
        c3.setCellValue("등급");

        Cell c4 = r.createCell(3);
        c4.setCellValue("가격");

        Cell c5 = r.createCell(4);
        c5.setCellValue("내용");


        try {
            String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\건담.xlsx";

            FileOutputStream fos = new FileOutputStream(path);

            w.write(fos); //파일쓰기
            w.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}


