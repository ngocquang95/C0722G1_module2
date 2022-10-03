package week3.model;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private Double score;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
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

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // Sắp xếp id tăng dần,nếu id trùng nhau thì sắp xếp theo tên
        int compareID = Integer.compare(this.id, o.getId());
        // Sắp xếp theo id
        if (compareID != 0) {
            return compareID;
        }

        // Sắp xếp theo Name
        int compareName = this.name.compareTo(o.getName());
        if (compareName != 0) {
            return compareName;
        }

        // Sắp xếp theo Score
        return this.score.compareTo(o.score);
    }


}
