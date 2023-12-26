package chap_06;



public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "01-1234-5678";
        return phoneNumber;
    }

    // 호텔 주소
    public static void getAddress() {
        String a = "서울시 어딘가";
    }

    // 호텔 액티비티


    public static void main(String[] args) {
        // 반환 값, Return
        String contactNumber = getPhoneNumber();
        //String contactAdd = getAddress();
        System.out.println("호텔 전화번호 : " + contactNumber);
        //System.out.println("호텔 주소 : " + getAddress());
        //System.out.println("호텔 주소 : " + contactAdd);
        // System.out.println(getAddress());
        getAddress();
    }

    // 리턴하여 값을 새로운 변수에 저장하는 이유
    // 1. 해당 값을 계속해서 사용해야 할때
    // 2. 해당 기능을 여러곳에서 사용해야 하지만 서로 값이 다른 경우

}
