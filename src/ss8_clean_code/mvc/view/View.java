package ss8_clean_code.mvc.view;

import ss8_clean_code.mvc.controller.StudentController;

public class View {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.displayMenu();
    }
}
