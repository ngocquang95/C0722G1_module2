package ss2_array_loop;

import java.util.Scanner;

public class LoopStudy {
    public static void main(String[] args) {
//        int n = 5;

//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + "\t");
//        }
//        int i = 1;
//        while (i <= n) {
//            System.out.print(i + "\t");
//            i++;
//        }
//        for (i = 1; i <= n; ) {
//            System.out.print(i + "\t");
//            i++;
//        }

//        int i = 1;
//        while (true) {
//            i++;
//            if (i % 2 == 0) {
//                continue;
//            }
//
//            if (i % 5 == 0) {
//                break;
//            }
//
//            System.out.println(i);// 3
//        }
        //"\t", '"'
//        char x = '"';
//        String c = "'\n'";
//        System.out.println(c);


        // Nhập vào số nguyên dương
        // System.in là một tiêu chuẩn để nhận dữ liệu từ bạn phím
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Nhập vào số nguyên dương: ");
////        int n = scanner.nextInt(); // 20 enter
//        int n = Integer.parseInt(scanner.nextLine());
//
//        System.out.print("Nhập vào tên của bạn: ");
//        String name = scanner.nextLine();


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

        System.out.println("n = " + n);
    }
}
