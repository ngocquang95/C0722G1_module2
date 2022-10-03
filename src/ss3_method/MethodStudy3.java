package ss3_method;

public class MethodStudy3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        if (isPrime3(10)) {
            System.out.println("n là số nguyên tố");
        } else {
            System.out.println("N không phải là số nguyên tố");
        }
    }

    /*
    Cách thiếu nhi
     */
    static void isPrime(int n) {
        if (n < 2) {
            System.out.println("Không phải số nguyên tố");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    System.out.println("Không phải số nguyên tố");
                    break;
                }
            }

            if (isPrime) {
                System.out.println("n là số nguyên tố");
            }
        }
    }

    /*
    Cách người lớn
     */
    static void isPrime2(int n) {
        if (n < 2) {
            System.out.println("Không phải số nguyên tố");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Không phải số nguyên tố");
                return;
            }
        }
        System.out.println("n là số nguyên tố");
    }

    /*
    Cách người trưởng thành
     */
    static boolean isPrime3(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
