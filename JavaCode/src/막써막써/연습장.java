package 막써막써;

import java.io.*;

public class 연습장 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        System.out.printf("%d + %d = %d %n", a, b, a+b);

        String s = "abcde";

        String str = Integer.toString(a);
        System.out.println(str);

//        InputStream;
//        InputStreamReader;
//        BufferedReader;
//        Reader;
//        FileInputStream;

        InputStream put = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

        try {
            FileInputStream fis = new FileInputStream(s);


            fis.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
