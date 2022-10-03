package ss7_abstract_interface;

public interface Activity extends Runnable, Flyable { // Đa kế thừa nè
    //    public static final int COUNT_STUDENT = 10;
    int COUNT_STUDENT = 10;

    //    public abstract void run();
    void drink();

    default void nhau() {
        System.out.println("Nhậu đê");
    }

    static void kara() {
        System.out.println("kara đê");
    }
}
