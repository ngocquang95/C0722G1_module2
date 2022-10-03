package ss12_map_tree.controller;

import ss6_inheritance.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        Map<Student, String> stringMap = new HashMap<>();

        stringMap.put(new Student(1, "Công", 5.5), "SV001");
        stringMap.put(new Student(1, "Sang", 2.3), "SV002");

        Set<Student> integerSet = stringMap.keySet();
        for (Student key : integerSet) {
            System.out.printf("%s - %s\n", key, stringMap.get(key));
        }
    }
}
