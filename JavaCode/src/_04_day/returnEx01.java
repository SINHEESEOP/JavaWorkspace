package _04_day;

public class returnEx01 {
    public static void main(String[] args) {

        /*
    - return 의 다양한 사용

    1. return 값이 있는 메서드는 호출문 자체가 값이 됩니다.
    2. 그래서 다른 메소드의 매개값으로 사용될 수도 있습니다.
    - 예제2) 확인

    3. 반환 유형이 없는 메소드는 반환유형 자리에 void 라고 적습니다.
    4. void 형 메소드는 단순히 사용만 가능하다.
    5. return 키워드는 반환과, 종료의 의미를 가집니다.
    6. vodi 메서드는

     */
//        예제1)
        add(1, 4);

//        예제2)
        System.out.println(add(add(1, 2), add(3, 4)));
//        예제3)
        multi();

//        사용 불가능한 메소드 사용법 : 해당 메소드는 리턴값이 없기 때문
//        System.out.println(multi());
        noReturn("피카츄");
    }
    static void multi() {
        System.out.println("5 x 3 = 15");
    }
    static int add(int a, int b) {
        return a + b;
    }
    static void noReturn (String name) {
        if (name.equals("피카츄")) {
            System.out.println("피카츄가 진화하면 라이츄입니다.");
            // 해당 출력문은 문자열이 아니라서 sout 앞에 return 이 못 붙음
            return; // 반환해주는 값이 없는데 사용 가능.. why?
        }
        System.out.println(name + "이 아니라 피카츄를 전달하세요");
    }
}
