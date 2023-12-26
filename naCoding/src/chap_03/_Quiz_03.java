package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String rrNumber = "980120-1234567";
        System.out.println(rrNumber.substring(0,8));

        rrNumber = "001234-2242578";
        System.out.println(rrNumber.substring(0, rrNumber.indexOf("-") + 2 ));
    }
}
