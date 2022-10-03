package ss13_search;

public class Main {
    // Tính giai thừa // n! = 1 * 2 * ... * (n - 1) * n
    // Không sử dụng đệ quy
    long factorial(int n) {
        long fac = 1;
        for (int i = 2; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    //Đệ quy: Tự gọi chính nó => Xác định điểm dừng
    // Sử dụng đệ quy
    /*
    n = 4;
    factorial2(4) = factorial2(3) * 4 = 6 * 4 = 24
    factorial2(3) = factorial2(2) * 3; = 2 * 3 = 6
    factorial2(2) = factorial2(1) * 2; = 1 * 2 =2
    factorial2(1) = 1
     */
    static long factorial2(int n) {
        if (n < 100) {
            return 1;
        }

        return factorial2(n - 1) * n;
    }
}
