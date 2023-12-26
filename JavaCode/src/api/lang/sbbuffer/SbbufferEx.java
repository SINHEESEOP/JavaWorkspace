package api.lang.sbbuffer;

public class SbbufferEx {
    public static void main(String[] args) {

        // buffer, builder는 기능은 동일합니다.
        // buffer는 쓰레드환경에서 동기화제공. builder는 싱글스레드에서만 사용하는게 좋습니다.

        StringBuffer sbur = new StringBuffer("Java");
        StringBuilder sbil = new StringBuilder("Java");
        String s = new String("Java");

        System.out.println(sbur);
        System.out.println(sbil);
        System.out.println(s);

        sbur.append("program");
        System.out.println(sbur);

        sbur.insert(4, " Support ! ");
        System.out.println(sbur);

//        sbur.delete() /// subString 임 ㅇㅇ

//        toString = 어딜가도 문자열로 변경.
//        해당 equals 는 당연히 사용이 불가, 이유는? 나도 모름
        System.out.println(s.equals(sbur));

    }
}
