package ss20_solid._5_interface_segregation_principle.correct;

public class Student {
    private int id;
    private String name;
    private Laptop laptop;

    public Student(int id, String name, Laptop laptop) {
        this.id = id;
        this.name = name;
        this.laptop = laptop;
    }
}
