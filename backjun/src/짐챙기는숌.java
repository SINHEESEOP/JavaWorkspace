import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 짐챙기는숌 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(); //
        int book = sc.nextInt();
        int box = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i < book; i++) { // 책 배열에 담기
            list.add(sc.nextInt());
        }
        if (book != 0) { // 책이 0개가 아닐 경우
            int a = 0;
            esc:
            while (true) { // 상자 준비.
                int kBox = box;
                while (true) { // 상자에서 책 무게 빼는 방법.
                    if (kBox < list.get(a)) { // 상자에 다음 책이 안들어가면 포장해서 보냄.
                        cnt++;
                        break;
                    } else if (list.size() - 1 == a) { // 마지막 책이라면 그냥 포장해서 보냄.
                        cnt++;
                        break esc;
                    }
                    kBox -= list.get(a);
                    a++;
                }
            }
        } else { // 책이 0개 라면 0 반환.
            cnt = 0;
        }
        System.out.println(cnt);
    }
}
