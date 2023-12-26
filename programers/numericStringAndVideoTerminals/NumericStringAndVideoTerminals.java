package programers.numericStringAndVideoTerminals;
// 2021 카카오 채용연계형 인턴십 //


public class NumericStringAndVideoTerminals {
    static int solution(String s) {
        String reStr = s
                .replaceAll("zero","0")
                .replaceAll("one","1")
                .replaceAll("two","2")
                .replaceAll("three","3")
                .replaceAll("four","4")
                .replaceAll("five","5")
                .replaceAll("six","6")
                .replaceAll("seven","7")
                .replaceAll("eight","8")
                .replaceAll("nine","9");
        return Integer.parseInt(reStr);
    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }
}
