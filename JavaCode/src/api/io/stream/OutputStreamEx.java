package io.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class OutputStreamEx {



    public static void main(String[] args) {

        /*
        *   1. 파일을 쓸 때 FileOutputStream 클래스 입니다. (파일이 없다면 해당 파일 생성 후)
        *   2. 1byte 기반으로 데이터르를 씁니다.
        *   3. OutputStream 클래스를 상속 받습니다.
        *   4. io 패키지에 있는 모든 클래스는 throws 를 던지고 있기 때문에, 반드시 try-catch 블록과 함께 사용됨
        * */

        Scanner sc = new Scanner(System.in);

        String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\test.txt";

        OutputStream fos = null;

        try {
            fos = new FileOutputStream(path);
            // 문장을 입력받음
            System.out.println("문장입력 > ");
            String str = sc.nextLine();
            byte[] arr = str.getBytes();
            fos.write(arr);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
