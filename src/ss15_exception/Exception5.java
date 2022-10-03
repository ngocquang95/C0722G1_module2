package ss15_exception;

import ss15_exception.exception.MaxAgeException;

public class Exception5 {
    public static void main(String[] args) {
        int age = 20;

        try {
            checkAge(age);
        } catch (MaxAgeException e) {
            System.out.println(e.getMessage());
        }

        checkAge2(20);
    }

    public static void checkAge(int age) throws MaxAgeException {
        if (age < 18) {
            throw new MaxAgeException("Chưa đủ tuổi");
        }
    }

    public static void checkAge2(int age) {
        try {
            if (age < 18) {
                throw new MaxAgeException("Chưa đủ tuổi");
            }
        } catch (MaxAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
