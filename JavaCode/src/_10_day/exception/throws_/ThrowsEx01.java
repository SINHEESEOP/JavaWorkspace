package _10_day.exception.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {
    public static void main(String[] args) {
        /*
            메소드 or 생성자에 발생되는 예외를 떠넘기는 키워드가 throws 입니다.
            throws가 붙은 메소드, 생성자를 호출할 때는 예외처리를 대신 진행해야 합니다.
            즉, 메소드 or 생성자 에서 예외처리를 강요하고 싶을 때 사용될 수 있습니다.
         */

        try {
            greeting(3);
        } catch (Exception e) {
            System.out.println("예외가 발생했습니다. 0~2사이 값을 넣어주세요");
        }

        // throws가 적용된 메소드 예시
        try {
            Class.forName("#QESAD");
        } catch (ClassNotFoundException e) {
            System.out.println("해당 클래스가 없습니다.");
        }

        // thows가 적용된 생성자 예시
        try {
            new FileInputStream("ASDFG");
        } catch (FileNotFoundException e) {
            System.out.println("해당 파일이 없습니다.");
        }

    }

    public static String[] arr = {"안녕하세요", "hello", "고니찌와"};
    public static void greeting(int index) throws Exception {
        System.out.println(index + "번째 인사법입니다.");
        System.out.println(arr[index]);
    }

}
