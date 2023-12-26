package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "i like Java and Python and c.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // and 를 , 로 반환
        System.out.println(s.substring(7)); // 인덱스 기준 7 부터 시작 (즉 7 부터 읽기 시작), (이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java"))); // 위와 같음
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); //

        // 공백 제거

        s = "         I LOVE         ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞뒤 공백 제거

        // 문자열 결합
        String s1, s2;
        s1 = "Java";
        s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2));

    }
}
