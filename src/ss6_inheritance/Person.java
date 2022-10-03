package ss6_inheritance;

public class Person extends Object {
    private int id;
    private String name;

    public Person() {
        super();
    }

    public Person(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(int x) {
        System.out.println("test() for Person");
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'';
    }
}
