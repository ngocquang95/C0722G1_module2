package ss4_oop.study;

public class TimerStudy {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Thời gian chạy: " + (endTime - startTime));
    }
}
