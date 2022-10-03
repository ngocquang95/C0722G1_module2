package ss7_abstract_interface;

public abstract class Student extends Person{
    public Student() {
    }

    public Student(int id, String name) {
        super(id, name);
    }

    @Override
    public void eat() {

    }

    @Override
    public void run() {
        System.out.println("Student run");
    }
}
