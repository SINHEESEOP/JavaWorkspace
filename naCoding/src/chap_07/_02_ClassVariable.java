package chap_07;

public class _02_ClassVariable {

    public static void main(String[] args) {

        BlackBox.canAutoReport = true;

        System.out.println(BlackBox.canAutoReport);

        // 클래스 변수는 : 동일한 클래스로 만들어진 인스턴스들에 내용을 한번에 전체변경 가능한 변수.
        // 인스턴스 변수는 : 동일한 클래스로 만들어진 인스턴스 마다 가지는 고유 변수.

    }
}
