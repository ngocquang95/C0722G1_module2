package ss1_introduction.exercise;

public class IfElse {
    public static void main(String[] args) {
        // score < 5 -> rot module
        // score >= 5  < 7-> kha
        // score >= 7 -> gioi

        double score = 6;

        //Cách thiếu nhi
        if (score >= 0 && score < 5) {
            System.out.println("Rớt module");
        }

        if (score >= 5 && score < 7) {
            System.out.println("kha");
        }

        if (score >= 7 && score <= 10) {
            System.out.println("gioi");
        }

        //Cách người trưởng thành
        if (score >= 0 && score < 5) {
            System.out.println("Rớt module");
        } else if (score < 7) {
            System.out.println("kha");
        } else if (score <= 10) {
            System.out.println("gioi");
        }

        //Cách người từng trải
        if (score < 5) {
            System.out.println("Rớt module");
        } else if (score < 7) {
            System.out.println("kha");
        } else {
            System.out.println("gioi");
        }
        //..
    }
}
