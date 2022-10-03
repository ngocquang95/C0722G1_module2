package ss3_method;

import java.util.Scanner;

public class MethodStudy2 {
    public static void main(String[] args) {
        // S = c! + c! + c!
        // Bước 1: Nhập c, c, c => c > 0, c > 0, c >0
        // Bước 2: Tính giai thừa của c, c, c
        // Bước 3: Tính tổng S
        Scanner scanner = new Scanner(System.in);

        int a = inputPositive("a");
        int b = inputPositive("b");
        int c = inputPositive("c");

        // n! = 1 * 2 * ... * (n-1) * n
        long factorialA = calculateFactorial(a);
        long factorialB = calculateFactorial(b);
        long factorialC = calculateFactorial(c);

        long s = factorialA + factorialB + factorialC;

        System.out.println("S = " + s);
    }

    private static long calculateFactorial(int n) {
        long factorialN = 1;
        for (int i = 2; i <= n; i++) {
            factorialN *= i;
        }
        return factorialN;
    }

    static int inputPositive(String target) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.printf("Nhập vào số nguyên dương %s: ", target);
            n = Integer.parseInt(scanner.nextLine());

            if (n < 0) {
                System.out.println("Bạn phải nhập vào số nguyên dương, xin hãy nhập lại!!!");
            }
        } while (n < 0);
        return n;
    }
}
