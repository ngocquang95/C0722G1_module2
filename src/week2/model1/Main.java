package week2.model1;

public class Main {
    public static void main(String[] args) {
        Person person = new Student();
        person = new Teacher();
        person.run(); //runtime => gọi đến phương thức run của student


        person.run(2.0);
//        Student student = (Student)person;
//        student.eat();

        if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            teacher.fly();
        }

        // compile => Person
        // runtime => Student
        Person[] people2 = {new Student(), new Teacher()};

        System.out.println(people2[0] instanceof Object);



    }
}
