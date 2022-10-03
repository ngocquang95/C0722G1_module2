package week2.model2;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student test() {
        System.out.println("Trả về: " + name);
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
