package ss15_exception;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
// -	NullPointerException
//        String str = null;
//        System.out.println(str.equals("Đăng Công"));

//-	    ArrayIndexOutOfBoundException
//        int[] arr = new int[10]; //index -> 0 -> len -1
//        arr[arr.length] = 2;

//-	    NumberFormatException
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào điểm: ");
//        double score = scanner.nextDouble(); //  InputMismatchException
        double score = Double.parseDouble(scanner.nextLine()); // NumberFormatException

        System.out.println("Điểm của bạn: " + score);

//        int b = null; //b được gọi là biến
//        Integer c = null; // c được gọi là biến tham chiếu
    }
}
