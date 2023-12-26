package api.lang.sbbuffer;

public class sbbufferEx02 {



    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        String str = "A";
        for (int i = 0; i < 300000; i++) {
            str += "A";
        }
        long end = System.currentTimeMillis();

        System.out.println("스트링버퍼 합계 : " + (end - start) * 0.001 );

        System.out.println("==============================================");

        long s = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("A");
        for (int i = 0; i < 300000; i++) {
            sb.append("A");
        }
        long e = System.currentTimeMillis();
        System.out.println("스트링버퍼 합계 : " + (e - s) * 0.001 );

        StringBuffer sb1 = new StringBuffer("A");
        System.out.println(sb.equals(sb1));
    }

}
