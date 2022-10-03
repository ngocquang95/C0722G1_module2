package ss13_search;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 10, 20, 50, 100, 200, 500};

        int index = binarySearch(arr, 500, 0, arr.length - 1);

        System.out.println(index);
    }

    static int binarySearch(int[] arr, int k, int left, int right) {
        if (right >= left) {
            int mid = (right + left) / 2; // tìm vị trí index ở giữa

            if (arr[mid] == k) { // Bước 2: Phần tử so sánh == với phần tử ở giữa => Trả về vị trí index
                return mid;
            }

            //Bước 4: Phần tử so sánh < với phần tử ở giữa => Xét mảng con bên trái
            if (k < arr[mid]) {
                return binarySearch(arr, k, left, mid - 1);
            }

            //k > arr[mid]
            // Bước 3: Phần tử so sánh > với phần tử ở giữa => Xét mảng con bên phải
            return binarySearch(arr, k, mid + 1, right);
        }

        return -1;
    }
}
