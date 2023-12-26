package _05_day;

public class Phone {

    // 멤버변수
    String model;
    int price;
    String color;
    // 생성자 - 생성자는 클래스이름과 대/소문자 까지 동일
    //       - 반환 유형은 적지 않습니다.
    Phone () { // 생성자에서 파라미터를 받지 않는 경우가 기본 생성자다.
        System.out.println("생성자 호출됨");
        // 멤버변수를 초기화 하는 역할
        model = "삼성갤럭시S30";
        price = 1000000;
        color = "red";
    }
    // 생성자는 중복으로 여러개 만들 수 있습니다.(생성자 오버로딩)
    // 규칙 - 매개변수의 종류 or 매개변수 개수가 달라야 합니다.
    Phone (String model) {
        model = "아이폰12";
        price = 200000;
        color = "white";

    }

    Phone (String model, int price) {
        this.model = "아이폰12";
        this.price = price;
        color = "Red";
    }

    Phone (String model1, int price1, String color1) {
        model = model1;
        price = price1;
        color = color1;
    }
    //메소드
    void info () {
        System.out.println("===휴대폰 정보===");
        System.out.println("모델: " + model);
        System.out.println("가격: " + price);
        System.out.println("색상: " + color);
    }
}
