package ss2_array_loop;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số lượng phần tử của mảng: ");
//        int n = scanner.nextInt(); // 20 enter
            n = Integer.parseInt(scanner.nextLine());

            if (n < 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin hãy nhập lại!!!");
            }
        } while (n < 0);

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào arr[%d]: ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }



        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }


        for (int item: arr) {
            System.out.println(item);
        }

//        System.out.println(Arrays.toString(arr));
    }
}
