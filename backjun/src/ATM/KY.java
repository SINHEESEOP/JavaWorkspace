package ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KY {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");

        int[] q = new int[num];

        for(int i = 0; i < q.length; i++){
            q[i] = Integer.parseInt(str[i]);
        }

        //1 2 3 3 4
        Arrays.sort(q);
        int waitTime = 0;
        int totalTime = 0;
        for(int i = 0; i < q.length; i++){
            //1 3 6 9 13
            waitTime += q[i]; //사람당 기다려야할 시간

//            if(i == q.length-1){ //마지막일 경우 자기인출시간만
//                totalTime += q[i];
//                break;
//            }

            totalTime += waitTime + q[i]; //현재 토탈 = 기다려야할 시간 + 자기 인출 시간
        }
        br.close();

        System.out.println(totalTime);


    }
}
