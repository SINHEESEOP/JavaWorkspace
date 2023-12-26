package programers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        HashMap<String,String> map = new HashMap<>();

        for(int i = 0; i < num; i++){
            String[] info = br.readLine().split(" ");
            if(Integer.parseInt(info[1]) < 10){ //월,
                info[1] = "0" + info[1];
            }
            if(Integer.parseInt(info[2]) < 10){ //일, 이 10보다 작으면 자리수를 맞추기 위해 0을 넣어준다
                info[2] = "0" + info[2];       //ex) 1일이면 -> 01 로 바꾼다
            }
            String age = info[3] + info[2] + info[1]; //년 월 일로 문자열 합친다
            map.put(info[0], age);

        }
        List<String> key = new ArrayList<>(map.keySet()); //키값들을 뽑아서

        key.sort(new Comparator<String>() { //년월일 문자열을 기준으로 키값인 이름 문자열들을 내림차순한다.
            @Override
            public int compare(String o1, String o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        });
        //내림차순 했으니, 0번 인덱스가 연장자, 마지막 인덱스가 막내이다
        String young = key.get(key.size()-1);
        String old = key.get(0);

        System.out.println(young);
        System.out.println(old);

    }
}
