package ss1_introduction.exercise;

import java.util.Scanner;

public class ScannerPrint {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
//        System.out.printf("%d + %d = %d", a, b, a + b);

        double d = 2.5;
        System.out.printf("%-10.2f", d);
        System.out.println("ok");
        //Đặc tả
        //Nguyên: %d
        // Thực: %f
        //String: %s
        // char: %c
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
//        int x2 = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();

        System.out.println("Str = " + str);
//        String str = "abc";
//        String str2 = new String("abc");
    }
}
