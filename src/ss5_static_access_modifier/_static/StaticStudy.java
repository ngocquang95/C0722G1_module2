package ss5_static_access_modifier._static;

import ss5_static_access_modifier.utils.InputUtil;

import java.util.Arrays;

public class StaticStudy {
    static int count = 20;
    static { // Khối static
        count = 1000;
        System.out.println("Khối static được gọi");
    }

    public static void main(String[] args) {
        {
            int a;
        }
        int a;
        System.out.println(Math.sqrt(4));
        System.out.println(Arrays.toString(args));

//        System.out.println("main được gọi: " + count);
//        Student student1 = new Student(1, "Ngọc Quang");
//        Student student2 = new Student(2, "Duy");

//        System.out.println(student1.countStudent);
//        System.out.println(student2.countStudent);
//        Student student3 = new Student();
//        System.out.println(student3.countStudent);
//        System.out.println(Student.countStudent); // Bắt buộc sử dụng
//
//
//        StaticStudy staticStudy = new StaticStudy();
//        staticStudy.test();
        Student student = new Student();
        student.setScore(100);

        System.out.println(student.getScore());
    }

    public void test() {
        count = 100;
    }
}
