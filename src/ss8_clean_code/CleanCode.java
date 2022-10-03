package ss8_clean_code;

public class CleanCode {
    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int MARCH = 3;

    //Tính xem tháng truyền vào có bao nhiêu ngày
    public static int getDayOfMonth(int month, int year) {
        switch (month) {
            case JANUARY:
            case MARCH:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case FEBRUARY:
                return isLeapYear(month) ? 29 : 28;
            default:
                return -1;
        }
    }

    /**
     * Mô tả: Truyền vào năm => Kiểm tra năm nhuận
     * Là năm chia hết cho 4 nhưng không chia hết cho 100 hoặc chia hết cho 400
     * Create by: QuangNN
     * Create date: 15/09/2022
     *
     * @param year: năm truyền vào
     * @return boolean
     */
    public static boolean isLeapYear(int year) {
        // 100 200 300 400 500 600 700 800 => 400 & 800 là năm nhuận
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;

        return (isDivisibleBy4 && !isDivisibleBy100) || isDivisibleBy400;
    }
}
