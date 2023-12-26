package chap_07;

public class BlackBox {

    static int counter = 0;
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;
    // 인스턴스 변수

    void autoReport() {
        if(canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    static boolean canAutoReport = false; // 자동 신고 기능 // static boolean canAutoReport 가 클래스 변수

    BlackBox() { // 메소드랑 비슷하게 생겼지만, 생성자라고 불리며 기능도 사실 비슷함
                // 그냥 객체가 생성될때 자동으로 호출되는 메소드임
                // BlackBox b1 = new BlackBox(); 라는 메소드 생성 시 아래 문구 자동 호출됨 // 실행 해보면 앎
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter; // 첫 객체는 1, 이후 객체는 2 ... 3 4 식으로 증가
    }

    BlackBox(String modelName, String resolution, int price, String color){
        this(); // 기본 생성자 호출

        System.out.println("기본 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.color = color;
        this.price = price;

    }

    // 클래스 매소드
    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000) + 로 연결합니다.");
    }


    // this 사용 예시 / 파라미터 값과 인스턴스 변수명이 같을 경우 파라미터 + 파라미터가 되어버리기 때문에
    // 해당 인스턴스 변수명이라고 정확학 지정해주기 위해 this로 지정해준 후 파라미터 값을 더한다.
//    public void appendModelName(String modelName) {
//        this.modelName += modelName;
//    }


    public void appendModelName(String ss) {
        modelName += ss;
    }



}
