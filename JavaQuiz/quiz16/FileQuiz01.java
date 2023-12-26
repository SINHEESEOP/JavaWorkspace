package quiz16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // IO 익셉션 하나랑, 파일이 없을떄는 나는 NOT 파운드 익셉션이 있다.

        System.out.println("파일명을 입력해주세요.");
        String file = sc.nextLine();
//        String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\"; // 내방식 잘못됨. 이유 정리하셈
        String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\" + file;
//        String copypath = "C:\\Users\\gsg04\\Desktop\\course\\upload\\copy.mp4";
        String copypath = "C:\\Users\\gsg04\\Desktop\\course\\upload\\" + file;
//        path += file; // 필요없지;

        byte[] arr = new byte[1024];
        int result = 0;

        try {
            FileInputStream fis = new FileInputStream(path);
            FileOutputStream fos = new FileOutputStream(copypath);

            while ((result = fis.read(arr)) != -1) {
                fos.write(arr, 0, result);
            }
            System.out.println("파일 복사 완료");


            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
