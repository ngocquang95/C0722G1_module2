package ss5_static_access_modifier._static;

public class Student {
    private int id; // Biến instance nè
    private String name;//non-static
    private double score;
    public static int countStudent; // Biến static

    public Student() {
        countStudent++;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
//        countStudent++;
        int bienCucBo;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        }
        //Exception
    }
}
