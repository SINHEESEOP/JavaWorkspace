package quiz08;

public class ArrayPrint {

    /*
        1. 생성자에 접근제어자를 붙여서, 객체 생성이 불가능하도록 처리
        2. 메서드 호출시에는 static 키워드를 붙여서 사용하도록 변경
     */

    private ArrayPrint () {
    }

    public static String toArray(int[] a) {

        String str = "[";

        for(int i = 0; i < a.length; i++) {
            str += a[i];
            if(i == a.length - 1) break;
            str += ", ";
        }

        str += "]";

        return str;
    }

    public static String toArray(char[] a) {
        String str = "[";

        for(int i = 0; i < a.length; i++) {
            str += a[i];
            if(i == a.length - 1) break;
            str += ", ";
        }

        str += "]";

        return str;
    }

    public static String toArray(String[] a) {
        String str = "[";

        for(int i = 0; i < a.length; i++) {
            str += a[i];
            if(i == a.length - 1) break;
            str += ", ";
        }

        str += "]";

        return str;
    }

}