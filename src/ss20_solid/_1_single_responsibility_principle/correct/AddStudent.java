package ss20_solid._1_single_responsibility_principle.correct;

import ss16_io_text_file.model.Student;
import ss20_solid._1_single_responsibility_principle.correct.utils.ReadFileUtil;
import ss20_solid._1_single_responsibility_principle.correct.utils.WriteFileUtil;

import java.io.IOException;
import java.util.List;

public class AddStudent {
    public static void main(String[] args) throws IOException {
        AddStudent addStudent = new AddStudent();

        addStudent.add();
    }

    public void add() throws IOException {
        // BƯớc 1: Đọc file => list
        List<Student> studentList = ReadFileUtil.getAllStudentFromFile();

        //Bước 2: => add student muốn thêm vào list
        studentList.add(new Student(11, "Linh", 0.7));

        //Bước 3: Viết list vừa add student vào file
        WriteFileUtil.writeFile(studentList);
    }


}
