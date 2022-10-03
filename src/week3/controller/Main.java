package week3.controller;

import week3.model.Student;
import week3.sort.IdAndNameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // comparable và comparator
        // Được dùng để sắp xếp

        //comparable => chỉ sắp xếp được một option
        // Sắp xếp theo id tăng dần
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Vịnh"));
        students.add(new Student(1, "Sang"));
        students.add(new Student(1, "Duy"));
        students.add(new Student(2, "Bảo"));
        Collections.sort(students); //  Tiến hành sắp xếp

        System.out.println("======= Menu =======");
        System.out.println("1. Sắp theo id tăng dần, nếu id == nhau thì sắp xếp theo tên giảm dần");
        Collections.sort(students, Collections.reverseOrder(new IdAndNameComparator()));
        System.out.println(students);
        System.out.println("2. Sắp theo tên giảm dần, nếu tên == nhau thì sắp xếp theo điểm giảm dần");
        Collections.sort(students, (o1, o2) -> 0);
        System.out.println(students);

//        Integer
        int a = 2;
        int b = 3;

        Integer.compare(a, b);

        Integer x = 2;
        Integer y = 3;
        x.compareTo(y);
    }
}



