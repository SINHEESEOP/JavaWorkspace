package quiz03;

public class ArrayPrint_shin {
    static String toArray(int[] a) {
        String b = "";
        for (int i = 0; i < a.length; i++) {
            String s = Integer.toString(a[i]);
            if (a[i] < a.length) {
                b += s + ", ";
            } else if (a[i] == a.length) {
                b += s;
            }
        }
        return "[" + b + "]";
    }

    static String toArray(char[] b) {
        String f = "";
        for (int i = 0; i < b.length; i++) {
            if (i < b.length - 1) {
                f += b[i] + ", ";
            } else if (i < b.length) {
                f += b[i];
            }
        }
        return "[" + f + "]";
    }

    static String toArray(String[] c) {
        String h = "";
        for (int i = 0; i < c.length; i++) {
            if (i < c.length - 1) {
                h += c[i] + ", ";
            } else if (i < c.length) {
                h += c[i];
            }
        }
        return "[" + h + "]";
    }

        public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        char[] b = {'1','2','3','4','5','6','7'};
        String[] c = {"1","2","3","4","5","6","7"};
        System.out.println(toArray(b));
    }
}
