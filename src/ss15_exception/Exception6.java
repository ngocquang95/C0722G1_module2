package ss15_exception;

import java.util.Scanner;

public class Exception6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score;
        while (true) {
            try {
                System.out.print("Nhập vào điểm: ");
                score = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Điểm sai định dạng, nhập lại");
            }
        }

        System.out.println("Điểm của bạn: " + score);

        System.out.println("Chương trình kết thức không lỗi lầm");
    }
}
