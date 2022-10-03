package ss4_oop.study;

public class Student extends Object {
    String name;
    int age;

    Student() {
    }

    Student(String name) {
        this.name = name; // dòng lệnh vô nghĩa nếu không có this
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println("Hi " + name + ", bạn có thể ăn");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
