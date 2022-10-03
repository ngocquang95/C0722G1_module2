package week3.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main2 {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now(); // lấy ra ngày giờ hiện tại

        System.out.println(today);


        String formattedDate = today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
//
        System.out.println(formattedDate);
    }
}
