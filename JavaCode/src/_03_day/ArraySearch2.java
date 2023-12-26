package _03_day;

import java.util.Arrays;

public class ArraySearch2 {
    public static void main(String[] args) {

        // 기초 알고리즘 이진탐색 - 배열에서 반을 잘라가면서 값을 찾는 방법
        // 조건 - 반드시 정렬이 되어있어야 합니다.

        // 1. 위치변수(startm end)를 처음과 끝에 지정
        // 2. 중간값을 구함
        // 3. 찾는값이 중간값 인지 확인
        // 4. 찾을값이 중간값 보다 크다면, end mid 에서 - 1로 내림
        //      - mid < get 일 경우, { start = mid + 1 }
        // 5. 찾을값이 중간값 보다 작으면, mid 값을 +1 로 올림
        //      - mid < get 일 경우 { end = mid - 1 }
        // 6. 이작업을 반복.

        int[] arr = {1,2,3,4,5,10,20,30,40,50,80,100};

        int find = 50;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) { // 교차지점이 생기면 반복을 중단.

            int mid = (start + end) / 2; // mid 는 중간 값.

            if (arr[mid] == find) {
                System.out.println(find + " 는 " + mid + " 번 째에 있습니다.");
                break;
            }
            if (arr[mid] < find) { // 찾는값이 중간값 보다 큰경우
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // 값을 찾지 못한 경우
        if (start > end) { // -1 이 되면 반환 ( ?? 왜 -1이 되는 것인지..? )
            System.out.println(find + " 는 없는 값 입니다.");
        }

        System.out.println("---------------------------");
        // 이진탐색 기능
        System.out.println(Arrays.binarySearch(arr, 50));
        // 위에서 만든 기능과 동일한 메소드이며,
        // 찾을값이 없다면 -1 를 반환한다.


    }
}
