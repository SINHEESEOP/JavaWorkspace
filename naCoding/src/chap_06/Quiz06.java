package chap_06;

public class Quiz06 {


    public static String getHidden(String name, int index) {
        String a = name.substring(0,index); // 980120-1
        //for (int i = index; i < name.length(); i++) // 이것도 가능
        for (int i = 1; i <= name.length() - index; i++) { // 나부터 뒤에 **을 채워줘야함
            a += "*";
        }
        return a;
    }


    public static void main(String[] args) {

        // 내일 할 것.
        // 1. 메소드 암기 및 퀴즈 풀기

        System.out.println(getHidden("010-2996-4913",9));

    }
}
