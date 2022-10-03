package ss4_oop.study;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    void test() {
        scanner.nextLine();
    }

    public static void main(String[] args) {
        Student[] students = new Student[1000];
        int countStudentC0722G1 = 2;

//        students[0] = new Student("Văn Thanh", 17);
//        students[1] = new Student("Bảo Phương", 16);
        for (int i = 1; i <= countStudentC0722G1; i++) {
            System.out.println("Nhập vào thông tin học viên thứ " + i);

            System.out.print("Nhập vào tên: ");
            String name = scanner.nextLine();

            System.out.println("Nhập vào tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());

            students[i - 1] = new Student(name, age);
        }

        for (int i = 0; i < countStudentC0722G1; i++) {
            System.out.println(students[i]);
        }
//
//        int a = 2; // 4 byte
//        Integer a2 = null; // 8byte

        String name = null;

        if (name != null) {
            System.out.println(name.toUpperCase());
        }
    }
}
