package programers.nationalContestSelectionTest;

import java.util.Arrays;

public class MungIn {
    public static void main(String[] args) {
        int[] rank= {3, 7, 2, 5, 4, 6, 1};
        int[] newRank = new int[rank.length];
        for (int i = 0; i < newRank.length; i++) {
            newRank[i] = i;
        }
        boolean[] attendance = {false, true, true, true, true, false, false};

        for (int i = 0; i < rank.length; i++) {
            if(!attendance[i]){
                rank[i] = 101;

            }
        }
        for (int i = 0; i < rank.length-1; i++) {
            for (int j = i+1; j < rank.length; j++) {
                if(rank[i] > rank[j]){
                    int temp = rank[i];
                    rank[i] = rank[j];
                    rank[j] = temp;
                    int temp2 = newRank[i];
                    newRank[i] = newRank[j];
                    newRank[j] = temp2;
                }
            }
        }
        System.out.println(Arrays.toString(rank));
        System.out.println(10000*newRank[0]+100*newRank[1]+newRank[2]);
    }
}
