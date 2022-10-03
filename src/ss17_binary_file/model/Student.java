package ss17_binary_file.model;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private transient Double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + (score == null ? "Điểm chưa có" : score) +
                '}';
    }

    public String getInfo() {
        return String.format("%s,%s,%s", this.id, this.getName(), score);
    }
}
