package ss20_solid._5_interface_segregation_principle.correct;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Hoàng Duy", new Macbook());
        Student student2 = new Student(1, "Hoàng Duy", new LapDell());
    }
}
