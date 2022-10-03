package ss8_clean_code.normal;

import java.util.Scanner;

public class Main {
    static Student[] students = new Student[1000];
    static int countStudent;

    static {
        students[0] = new Student(1, "Hoàng Duy");
        students[1] = new Student(2, "Minh Huy");
        students[2] = new Student(3, "Phương Bảo");
        countStudent = 3;
    }

    public static void main(String[] args) {
        //CRUD
        /**
         * C: create => Thêm vào mảng
         * R: read => đọc dach sánh
         * U: update => chỉnh sửa
         * D: delete => xóa
         */
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("===== Menu =====");
            System.out.println("1. Thêm student");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Chỉnh sửa");
            System.out.println("4. Xóa");
            System.out.println("5. Thóat\n");

            System.out.print("Mời bạn lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    break;
                case 2:
                    displayStudentList();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Chương trình đã kết thúc không lỗi lầm");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn sai, xin chọn lại");
            }

        }
    }

    public static void displayStudentList() {
        // Lấy dữ liệu => Để bài file sẽ học
        for (int i = 0; i < countStudent; i++) {
            System.out.println("Thông tin sinh viên thứ " + (i + 1));
            System.out.println(students[i]);
        }
    }
}
