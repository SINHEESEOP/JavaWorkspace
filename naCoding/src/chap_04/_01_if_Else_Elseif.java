package chap_04;

public class _01_if_Else_Elseif {
    public static void main(String[] args) {
//         조건문 if
//         if ( 조건 정보 )
//           ... 수행할 명령 ...

        int hour = 10;

        // if 문 내에서 하나의 문장을 실행할 경우 { } 생략 가능
        if (hour < 14) System.out.println("아이스 아메리카노 + 1");

        // 조건이 참일땐 { } 안의 문장을 출력함 거짓일 땐 else 를 출력함.
        // if 문 내에서 2개 이상의 문장을 실행할 때는 { } 생략 불가
        if (hour < 14) {
            System.out.println("아이스 아메리카노 + 1");
            System.out.println("샷추가");
        } else {
            System.out.println("커피주문 완료");
        }

        // 오후 2시 전이고, 모닝 커피를 마시지 않는 경우 아아 커피를 주문함.
        hour = 10; // 현재 시간
        boolean morningCoffee = false; // 모닝 커피 여부
        // if (hour < 14 && morningCoffee == false) // 참참이 나와야 아아를 주문함, 그래서 거짓 == 거짓을 통해 참으로 만든 것.

        if (hour < 14 && !morningCoffee) { // 차라리 이렇게 부정 연상을 통해 펄스 입력 값을 받고 트루로 바꿔어 주는 것이 편함.
            System.out.println("아아 + 1");
        } else { // 그 외의 경우이면
            System.out.println("커피 안묵어~");
        }

        System.out.println("-----------------------------");

        // 오후 2시 이후 이거나 모닝 커피를 마신 경우
        hour = 15;
        morningCoffee = false;
        if (hour < 14 && !morningCoffee) { // 오후 2시 전이고, 모닝 커피를 안마신 경우 실행
            System.out.println("아아 + 1");
        } else if (hour < 14 || !morningCoffee) { // 오후 2시 이후 이거나 모닝 커피를 마신 경우
            System.out.println("아아 디카페인 + 1");
        }



    }
}
