package ss8_clean_code.mvc.service.impl;

import ss8_clean_code.mvc.service.IStudentService;
import ss8_clean_code.normal.Student;

public class StudentService implements IStudentService {
    static Student[] students = new Student[1000];
    static int countStudent;

    static {
        students[0] = new Student(1, "Hoàng Duy");
        students[1] = new Student(2, "Minh Huy");
        students[2] = new Student(3, "Phương Bảo");
        countStudent = 3;
    }

    @Override
    public void display() {
        // Lấy dữ liệu => Để bài file sẽ học
        for (int i = 0; i < countStudent; i++) {
            System.out.println("Thông tin sinh viên thứ " + (i + 1));
            System.out.println(students[i]);
        }
    }
}
