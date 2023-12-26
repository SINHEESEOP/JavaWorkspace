package quiz;

import java.util.Scanner;

public class Quiz16 {
    public static void main(String[] args) {

        //배열의 size 는 조정 X
        String[] arr = new String[100];
        int index = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("먹고싶은 음식을 선택하세요");
        System.out.println("입력을 중지하려면 [그만]을  입력하세요.");

        boolean a = false;
        for (int i = 0; i < arr.length; i++) {

            String food = sc.next();
            arr[index] = food;

            if (food.equals("그만") && arr[0].equals("그만")) {
                break;
            } else if (food.equals("그만")) {
                System.out.println("입력 종료");
                a = true;
                break;
            }

            index++;
        }

        if (a) {
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("입력 받은 값이 없습니다.");
        }
//        String[] newArr = new String[index];
//
//        for (int i = 0; i < newArr.length; i++) {
//            newArr[i] = arr[i];
//        }
//
//        System.out.println(Arrays.toString(newArr));



///////////////////////////////////////////////////////////////


//
//        System.out.println("===========================");
//
//        // 태훈이형 방법. 이게 더 맞는 방법.
//        System.out.println("먹고싶은 음식을 선택하세요");
//
//        int count = 0;
//        for(int i = index; i <= arr.length; i++) {
//            String food = sc.next();
//            arr[i] = food;  // !! 중요 !! 64번줄과 65번 줄이 if 문 아래에 있으면 그만이라는 값이 리스트에 추가되지 않음.
//            count++;
//            if(food.equals("그만")) {
//                break;


//            }
//        }System.out.println("—입력 받은 메뉴—");
//        for(int i = 0;i < count - 1; i++) {
//            System.out.print(arr[i] + " ");
//        }
//








    }
}
