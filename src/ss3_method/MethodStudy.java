package ss3_method;

import java.util.Scanner;

public class MethodStudy {
    public static void main(String[] args) {
        // S = c! + c! + c!
        // Bước 1: Nhập c, c, c => c > 0, c > 0, c >0
        // Bước 2: Tính giai thừa của c, c, c
        // Bước 3: Tính tổng S
        Scanner scanner = new Scanner(System.in);

        int a;
        do {
            System.out.print("Nhập vào số nguyên dương a: ");
            a = Integer.parseInt(scanner.nextLine());

            if (a < 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin hãy nhập lại!!!");
            }
        } while (a < 0);

        int b;
        do {
            System.out.print("Nhập vào số nguyên dương b: ");
            b = Integer.parseInt(scanner.nextLine());

            if (b < 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin hãy nhập lại!!!");
            }
        } while (b < 0);

        int c;
        do {
            System.out.print("Nhập vào số nguyên dương c: ");
            c = Integer.parseInt(scanner.nextLine());

            if (c < 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin hãy nhập lại!!!");
            }
        } while (c < 0);

        // n! = 1 * 2 * ... * (n-1) * n
        long factorialA = 1;
        for (int i = 2; i <= a; i++) {
            factorialA *= i;
        }
        long factorialB = 1;
        for (int i = 2; i <= b; i++) {
            factorialB *= i;
        }
        long factorialC = 1;
        for (int i = 2; i <= c; i++) {
            factorialC *= i;
        }

        long s = factorialA + factorialB + factorialC;

        System.out.println("S = " + s);
    }
}
