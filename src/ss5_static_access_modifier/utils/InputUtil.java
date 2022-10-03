package ss5_static_access_modifier.utils;

import java.util.Scanner;

public class InputUtil {
    public static int inputPositive() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số nguyên dương: ");
//        int n = scanner.nextInt(); // 20 enter
            n = Integer.parseInt(scanner.nextLine());

            if (n < 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin hãy nhập lại!!!");
            }
        } while (n < 0);
        return n;
    }
}
