package io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputstreamEx {

    public static void main(String[] args) {

        String path = "C:\\Users\\gsg04\\Desktop\\course\\upload\\test.txt";
        String copypath = "C:\\Users\\gsg04\\Desktop\\course\\upload\\test1.txt";

//        try {
//            FileInputStream fis = new FileInputStream(path);
//
////            System.out.println( (char) fis.read() );
////            System.out.println( (char) fis.read() );
////            System.out.println( (char) fis.read() );
////            System.out.println( (char) fis.read() );
////            System.out.println( (char) fis.read() );
////            System.out.println( (char) fis.read() );
////            System.out.println( (char) fis.read() );
////            System.out.println( (char) fis.read() );
////            System.out.println( (char) fis.read() );
////            System.out.println( (char) fis.read() );
////            System.out.println( (char) fis.read() );
////            System.out.println( (char) fis.read() );
//
//            fis.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }

        byte[] arr = new byte[1024];
        try {
            FileInputStream fis = new FileInputStream(path);
            FileOutputStream fos = new FileOutputStream(copypath);
            int result;
            while ((result = fis.read(arr)) != -1) {
                fos.write(arr, 0, result);
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }






    }


}
