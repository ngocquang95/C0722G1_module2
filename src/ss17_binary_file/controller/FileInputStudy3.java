package ss17_binary_file.controller;

import ss17_binary_file.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileInputStudy3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // ================ Write ================
        FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_binary_file/data/data.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

//        String name = "hello";
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Hoàng Duy", 2.3));
        studentList.add(new Student(2, "Đức Vịnh", 3.2));
        objectOutputStream.writeObject(studentList);
//        objectOutputStream.writeObject("Hello");
//        objectOutputStream.writeObject("Đức Vịnh");

        objectOutputStream.close();


        // ================ Read ================
        FileInputStream fileInputStream = new FileInputStream("src/ss17_binary_file/data/data.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<Student> students = (List<Student>) objectInputStream.readObject();
        students.get(0).setScore(10.0); //10/110
        System.out.println(students.get(0));
        System.out.println(students.get(1));

        objectInputStream.close();
    }
}
