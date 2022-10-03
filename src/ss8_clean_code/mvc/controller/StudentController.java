package ss8_clean_code.mvc.controller;

import ss8_clean_code.mvc.service.IStudentService;
import ss8_clean_code.mvc.service.impl.StudentService;

import java.util.Scanner;

/**
 * MVC
 * M: model lớn = model nhỏ + service => service => Nơi xử lý tất cả nghiệp vụ
 * V: view => Kích hoạt controller
 * C: controller =>  Điều hướng & gọi service
 */
public class StudentController {
    public void displayMenu() {
        IStudentService iStudentService = new StudentService();
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
                    iStudentService.display();
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
}
