package ss3_method;

import java.util.Arrays;

public class ByPassValueAndReference {
    public static void main(String[] args) {
        // Truyền tham trị
        int x = 20;
        changeData(x);

        // Truyền tham chiếu
        int[] a = {1, 2, 3, 4, 5};
        changeData(a);
        System.out.println(Arrays.toString(a));
    }

    static void changeData(int[] arr) {
        arr[0] = 100;
        arr = new int[] {1,2,3,4,5};
        arr[1] = 200;
        System.out.println(Arrays.toString(arr));
    }

    static void changeData(int n) {
        n = 100;
    }
}
