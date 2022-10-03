package ss13_search;

public class LinearSearch {
    //Trả về vị trí index tìm thấy phần tử k ở trong mảng
    // Trả về vị trí index nếu tìm thấy
    // trả về -1 nếu không tìm thấy
    public static int linearSearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
