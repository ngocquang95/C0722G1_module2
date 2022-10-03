package ss6_inheritance;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        // Ép kiểu ngầm định => Do java tự làm
        // Con -> Cha
        // compile: Phụ thuộc vào kiểu dữ liệu
        // runtime: phụ thuộc vào đối tượng tham chiếu tới
        Person person = new Student();
        // Ép kiểu tường minh => Lập trình viên phải tự chủ động ép kiểu
        // Cha -> con
        Student student = (Student) person;

        // instanceof: kiểm tra xem đối tượng có phải là thể hiện của class hay không
        // Kiểm tra student có phải là một thể hiện của Student
        //instanceof thực hiện lúc runtime
        if (student instanceof Student) { // true
            System.out.println("Line 16");
        }

        if (person instanceof Student) { // true
            System.out.println("Line 20");
        }
    }
}
