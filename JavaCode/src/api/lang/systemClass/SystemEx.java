package api.lang.systemClass;

import java.io.PrintStream;
import java.util.Properties;
import java.util.Scanner;

public class SystemEx {

    public static void main(String[] args) {
        // System 클래스는 운영체재 관련된 기능을 가지고 있습니다.
        // 전부 static 메소드 입니다.

        // 콘솔의 출력
        System.out.println();
        // .out 은 PrintStream 이라는 객체를 생성해서 받아옴
        PrintStream out = System.out;
        out.println("hello world");
        System.out.println("hello world");

        // 키보드로 입력 받겠다.
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");

        // 운영체제 관련된 내용을 얻을 수 있음
        Properties p = System.getProperties();
        System.out.println(p);

        System.out.println(p.get("user.name"));
        System.out.println(p.get("os.version"));

        // 1970.1.1일 부터 현재까지 지난시간을 밀리초로 반환
        long start = System.currentTimeMillis();
        System.out.println(start);


    }


}
