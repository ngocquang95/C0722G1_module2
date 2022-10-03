package ss15_exception;

import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;

        System.out.print("Nhập vào điểm: ");
        double score = Double.parseDouble(scanner.nextLine());
        System.out.println(str.equals("Đăng Công"));

        System.out.println("Điểm của bạn: " + score);

        System.out.println("Chương trình kết thức không lỗi lầm");
    }
}
