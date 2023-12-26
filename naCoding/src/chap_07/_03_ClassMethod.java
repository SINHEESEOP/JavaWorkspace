package chap_07;

import java.util.*;

public class _03_ClassMethod {
    public static void main(String[] args) {

        BlackBox b1 = new BlackBox();
        BlackBox b2 = new BlackBox();

        // 일반 메소드
        b1.autoReport(); // 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원 됨
        b1.callServiceCenter();

        b2.callServiceCenter();

        BlackBox.callServiceCenter();

        Scanner sc = new Scanner(System.in);

        String a = new String();
        String b = new String();
        a = "안녕하세요";
        a.substring(1);

        a = b;

        String c = "안녕하세요";
        System.out.println(a == b);
        String.valueOf("안녕하세요");

        /*
            인스턴스 메소드 = 객체를 생성해줘야 사용 가능하며, 객체마다 값이 달라질 수 있음.
            클래스 메소드 = 객체를 만들지 않고도 (클래스명.메소드명) 으로 사용 가능 당연히 값도 달라질 수 있음.

        */

        b1.modelName = "까망이";
        b1.appendModelName("/최신형"); // 인틀리제이 기능, 빨간색이 뜨는 문구에서 알트 + 엔터하면 몇 가지 해결 옵션을 준다.
                                            // 메소드를 컨트롤 클릭 or 메소드 클릭후 컨트롤 쉬프트 I 로 해당 메소드 확인 가능
        System.out.println(b1.modelName);
    }
}
