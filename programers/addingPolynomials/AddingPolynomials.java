package programers.addingPolynomials;

public class AddingPolynomials {
    static String solution(String polynomial) {
        String answer = "";

        int num2 = 0; // Ax 의 값
        int num3; // 일반 숫자 값
        int cnt = 0; // x 의 갯수
        int sumX = 0; // X의 합

        String result;

        char c = ' ';
        boolean bool = false;

        char[] chPoly = polynomial.toCharArray();

        for (int j = 0; j < chPoly.length; j++) {

            if (chPoly[j] == 'x' && chPoly[j - 1] != c) { // Ax 의 값
                int num1 = Character.getNumericValue(chPoly[j - 1]);
                num2 += num1;
            }
            if (chPoly[j] == 'x' && chPoly[j - 1] == c) { // x 의 갯수를 찾음
                cnt++;
            }
            sumX = num2 + cnt;

//            if (chPoly[j] != '+' && chPoly[j] != 'x' && chPoly[j - 1] != c) { // 일반 수를 찾자
//                num3 = chPoly[j];
//                bool = true;
//            }
//
//            answer = bool ? String.valueOf(sumX) + " + " + String.valueOf(num3) : String.valueOf(sumX) + "x" ;
        }
            return answer;
    }

    public static void main(String[] args) {

        solution("3x + 7x + x");

    }

    public static class teahoon1 {

        static String sol(String polynomial) {

    //        String polynomial = "0";
            // 문자열을 공백을 기준으로 쪼갠 문자열
            String[] polynomial_copy = polynomial.split(" ");

            int str_num = 0;
            int num = 0;

            for (int i = 0; i < polynomial_copy.length; i++) {
                if (polynomial_copy[i].contains("x")) {
                    if (polynomial_copy[i].equals("x")) {
                        str_num++;

                    } else if (!polynomial_copy[i].equals("x")) {
                        // replaceAll 안에 있는 모든것을 바꿔주다 (x 를, 공백으로)
                        str_num += Integer.parseInt(polynomial_copy[i].replace("x", ""));

                    }
                    // 이것이 제일 뒤에 나오는 이유는 위에서 x값을 걸러내줘야 하기 때문
                } else if (!polynomial_copy[i].equals("+")) {
                    num = num + Integer.parseInt(polynomial_copy[i]);
                }

            }
            if (str_num == 1 && num == 0) {
                System.out.println("x");
            }
            if (str_num == 0) {
                System.out.println(num);
            }
            if (str_num > 1 && num != 0) {
                System.out.println(str_num + "x" + " " + "+" + " " + num);
            }
            if (str_num > 1 && num == 0) {
                System.out.println(str_num + "x");
            }

            if (str_num == 1 && num != 0) {
                System.out.println("x" + "+" + num);
            }
            return null;
        }

        public static void main(String[] args) {


        }
    }
}