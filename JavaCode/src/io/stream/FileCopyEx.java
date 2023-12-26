package io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;

public class FileCopyEx {



    public static void main(String[] args) {

        String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\hello.mp4";
        String copypath = "C:\\Users\\gsg04\\Desktop\\course\\upload\\copy\\copy.mp4";

        try {
            FileInputStream fis = new FileInputStream(path);
            FileOutputStream fos = new FileOutputStream(copypath);

            // 바이트 배열 단위로 읽을 수 있음.
            byte[] arr = new byte[1000];  // 왜 1000으로 함? 왜 배열 단위로 읽음? //answer : 동영상크기가 너무커서 바이트 하나하나 일일이 읽기 싫어서
//            fis.read(arr);                                                 //우리가 복사한 동영상 17.7MB (18,602,859 바이트)임
//            System.out.println(Arrays.toString(arr));
            int result = 0;
//            // 읽은 바이트의 개수를 반환, 더이상 읽을게 없다면 -1;
//            while ((result = fis.read(arr)) != -1) {
//                   sout tostring arr
//            }

//            result = 0;
            while ((result = fis.read(arr)) != -1) { // 왜 식이 이럼? //배열바이트로 읽을경우 result에 반환되는건 배열크기 or -1 만 들어옴
                fos.write(arr, 0, result); // 써내릴 배열, 시작값, 끝값 // ?? //배열 , 몇번째부터 시작할지, result인이유는 바로위 주석 보셈
            }
            System.out.println("파일 복사 완료");

            fis.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
