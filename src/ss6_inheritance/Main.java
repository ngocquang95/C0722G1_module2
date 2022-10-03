package ss6_inheritance;

public class Main {
    public static void main(String[] args) {
        final int MAX_SCORE = 10;
        Student student1 = new Student(234234234, "Hoàng Duy", 1.5);
        Student student2 = new Student(1, "Hoàng Duy", 1.5);

        System.out.println(student1.equals(student2));

//        String str1 = "Hello";
//        String str2 = "Hello";
//        str1.equals(str2)
    }
}
