package ss20_solid._1_single_responsibility_principle.correct.utils;

import ss16_io_text_file.model.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileUtil {
    public static List<Student> getAllStudentFromFile() throws IOException {
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
}
