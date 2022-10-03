package ss16_io_text_file.controller;

import ss16_io_text_file.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileForStudent {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ss16_io_text_file/data/student.csv");

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        List<Student> studentList = new ArrayList<>();
        String[] info;
        Student student;
        while ((line = bufferedReader.readLine()) != null) {
            // Đã đọc được từng line => mỗi line sẽ tương ứng với 1 student
            info = line.split(","); // 1,Hoàng Duy,2.3
            student = new Student(Integer.parseInt(info[0]), info[1], Double.parseDouble(info[2]));
//            Student student = new Student();
//            student.setId(Integer.parseInt(info[0]));
//            student.setScore(Double.parseDouble(info[2]));
//            student.setName(info[1]);
            studentList.add(student);
        }
        bufferedReader.close();
        // Xuất thông tin
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
