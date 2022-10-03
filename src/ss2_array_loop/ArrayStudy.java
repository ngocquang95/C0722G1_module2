package ss2_array_loop;

public class ArrayStudy {
    public static void main(String[] args) {
        int[] arr; //khai báo mảng
        int arr2[]; //Theo C

        arr = new int[10]; //Khởi tạo

        int[] arr3 = new int[10];

        int[] arr4 = new int[]{1, 2, 4, 5, 6};
//        int[] arr6;
//        arr6 = {1, 2, 4, 5, 6};
        int[] arr5 = {1, 2, 4, 5, 6};


        int[] arr7 = {1, 2, 4, 5, 6};
        int[] arr8 = arr7;

        arr8[0] = 100;
//        arr8 = new int[] {1, 2};
        arr8[1] = 200;
        System.out.println("arr7[0] = " + arr7[1]);


        //Mảng 2 chiều
        int[][] arr9 = new int[][]{{1, 2}, {3, 4, 5}, {6, 7}};

        System.out.println(arr9[0][0]); // 1
        System.out.println(arr9[1][2]); // 5
        System.out.println(arr9.length); // 3
        System.out.println(arr9[2].length); // 2

        String name = "Ngọc Quang";
        int len = name.length();
    }
}
