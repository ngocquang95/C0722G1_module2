package ss15_exception;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HuyHuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //convert String to LocalDate

        LocalDate localDate;
        while (true) {
            try {
                System.out.print("Nhập vào ngày: ");
                localDate = LocalDate.parse(scanner.nextLine(), formatter);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Ngày sai định dạng, nhập lại");
            }
        }

        System.out.println(localDate);
    }
}
