package ss15_exception;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = null;

        try {
            System.out.print("Nhập vào điểm: ");
            double score = Double.parseDouble(scanner.nextLine());
            System.out.println(str.equals("Đăng Công"));

            System.out.println("Điểm của bạn: " + score);
        } catch (NumberFormatException e) {
            e.printStackTrace();
//            System.out.println(e.getMessage());
            System.out.println("Định dạng điểm không hợp lệ");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Đang bị null");
        }

        System.out.println("Chương trình kết thức không lỗi lầm");
    }
}
