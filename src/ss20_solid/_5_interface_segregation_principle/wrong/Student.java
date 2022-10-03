package ss20_solid._5_interface_segregation_principle.wrong;

public class Student {
    private int id;
    private String name;
    private LapDell lapDell;

    public Student(int id, String name, LapDell lapDell) {
        this.id = id;
        this.name = name;
        this.lapDell = lapDell;
    }
}
