package ss14_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;

        a = a + b;
        b = a - b; //b = a
        a = a - b; //a + b - a

//        int[] a = {2, 7, 8, 9, 1, -5};
//        int[] a = {2, 1, 3, 4, 5, 6};
//
//        bubbleSort(a);
//
//        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] arr) {
        boolean isSwap = true;
        for (int i = 0; i < arr.length - 1 && isSwap; i++) {
            isSwap = false; // Mảng đã sắp xếp
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // true khi mảng chưa sắp xếp xong
                    isSwap = true; // for của i tiếp tục chạy
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
