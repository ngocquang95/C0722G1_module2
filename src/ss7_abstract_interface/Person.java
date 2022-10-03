package ss7_abstract_interface;

public abstract class Person implements Activity, Flyable, Runnable {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void eat();
    public abstract void eat2();
//    public abstract void eat3();
//    public abstract void eat4();
    public void run() {
        System.out.println("Person run");
    }
}
