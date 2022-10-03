package ss6_inheritance;

// Student is a Person
//has-a: Student has-a Address
public class Student extends Person {
    private double score;

    // Address address;
    public Student() {
        super();
    }

    public Student(int id, String name, double score) {
        super(id, name);
        this.score = score;
    }

    @Override
    public void test(int x) {
        System.out.println("test() for Student");
    }

    public void check() {
//        this.test();
//        super.test();
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.score, score) == 0 && Integer.compare(student.getId(), this.getId()) == 0;
    }

    public void methodStudent() {
    }
}
