package ss16_io_text_file.controller;

import ss16_io_text_file.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddStudent {
    public static void main(String[] args) throws IOException {
        AddStudent addStudent = new AddStudent();

        addStudent.add();
    }

    public void add() throws IOException {
        // BƯớc 1: Đọc file => list
        List<Student> studentList = getAllStudentFromFile();

        //Bước 2: => add student muốn thêm vào list
        studentList.add(new Student(11, "Linh", 0.7));

        //Bước 3: Viết list vừa add student vào file
        writeFile(studentList);
    }


    private List<Student> getAllStudentFromFile() throws IOException {
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
            try {
                student = new Student(Integer.parseInt(info[0]), info[1], Double.parseDouble(info[2]));
                studentList.add(student);
            }catch (Exception e) {

            }

        }
        bufferedReader.close();

        return studentList;
    }

    private void writeFile(List<Student> studentList) throws IOException {
        File file = new File("src/ss16_io_text_file/data/student.csv");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Student s : studentList) {
            bufferedWriter.write(s.getInfo());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
