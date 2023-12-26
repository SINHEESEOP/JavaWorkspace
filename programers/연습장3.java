package programers;

public class 연습장3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 3, 3, 4};

        int[] arr = new int[array.length];

        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    cnt++;
                }
            }
            arr[i] = cnt;
            cnt = 0;
        }
        int index = 0;
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

        if (arr[arr.length-1] == arr[arr.length-2]) {
            cnt = -1;
        } else {
            cnt = arr[arr.length];
        }

    }
}