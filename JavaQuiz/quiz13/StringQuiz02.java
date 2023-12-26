package quiz13;

public class StringQuiz02 {

    public static String masking(String str) throws Exception {

        if (!(str.length() == 13 || str.length() == 14)) {
            throw new Exception();
        }

        if (!(str.charAt(6) == '1' || str.charAt(6) == '3' || str.charAt(6) == '2' || str.charAt(6) == '4')) {
            throw new Exception();
        }

        str = str.replace("-", "");
        String result = "";

        if (str.length() == 13) {
            if (str.charAt(6) == '1' || str.charAt(6) == '3') {
                System.out.println("남자입니다.");
            }
            if (str.charAt(6) == '2' || str.charAt(6) == '4') {
                System.out.println("여자입니다.");
            }
            result = str.substring(0, 6);
            str = str.substring(6, str.length());
            str = "-*******";
            result = result + str;
        }
        return result;
    }



    public static void main(String[] args) {
        try {
            System.out.println(masking("980120-1234567"));
        } catch (Exception e) {
            System.out.println("다시 입력해");
        }
    }
}
