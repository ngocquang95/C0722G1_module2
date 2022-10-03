package ss20_solid._1_single_responsibility_principle.correct.utils;

import ss16_io_text_file.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileUtil {
    public static void writeFile(List<Student> studentList) throws IOException {
        File file = new File("src/ss16_io_text_file/data/student.csv");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Student s : studentList) {
            bufferedWriter.write(s.getInfo());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
