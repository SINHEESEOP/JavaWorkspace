package _03_day;

import java.util.Scanner;

public class ArraySearch1 {

    public static void main(String[] args) {

        //탐색(순회)
        int[] arr = {54, 23, 12, 76, 56, 45, 1, 2, 3};

        //입력받은 값이 배열에 있는가?
        Scanner scan = new Scanner(System.in);
        System.out.print("찾을값>");
        int search = scan.nextInt();

        boolean bool = false; //찾았다? 못찾았다?

//		for(int i = 0; i < arr.length; i++) {
//
//			if(arr[i] == search ) {
//				System.out.println(search + "는" + i + "번째 인덱스에 있습니다");
//				bool = true; //bool true라는 것은 if문을 실행했다는 의미
//				break;
//			}
//		}

        //반대로
        for(int i = arr.length-1 ; i > -1; i--) {
            if(arr[i] == search ) {
                System.out.println(search + "는" + i + "번째 인덱스에 있습니다");
                bool = true; //bool true라는 것은 if문을 실행했다는 의미
                break;
            }
        }




        if( bool == false ) {
            System.out.println(search + "는 없습니다");
        }



    }
}
