//package silverStringQuiz;
//
//public class SilverStringQuiz {
//
//    public static void main(String[] args) {
//
//        String a = "aadaabc";
//        String b = "aababbc";
//
//        int cnt = 0;
//        if (a.length() == b.length()) {
//            char[] charArr = a.toCharArray();
//            char[] charBrr = b.toCharArray();
//            for (int i = 0; i < charArr.length; i++) {
//                if (charArr[i] != charBrr[i]) {
//                    cnt++;
//                }
//            }
//        }
//
//        if (a.length() != b.length() && b.contains(a)) {
//            cnt = 0;
//        } else if (a.length() != b.length() && !(b.contains(a))) {
//            char[] charArr = a.toCharArray();
//            char[] charBrr = b.toCharArray();
//            for (int i = 0; i < charArr.length; i++) {
//                for (int j = 0; j < charArr.length; j++) {
//                    if (charArr[i] != charBrr[i]
//                }
//            }
//        }
//
//        System.out.println(cnt);
//
//    }
//
//}
