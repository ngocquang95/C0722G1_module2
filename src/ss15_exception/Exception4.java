package ss15_exception;

import ss15_exception.exception.MaxAgeException;

public class Exception4 {
    public static void main(String[] args) {
        int age = 20;

        try {
            if (age < 18) {
                throw new MaxAgeException("Chưa đủ tuổi");
            }
        } catch (MaxAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
