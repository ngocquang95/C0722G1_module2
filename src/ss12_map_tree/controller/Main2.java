package ss12_map_tree.controller;

import ss6_inheritance.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Map<String, Student> stringMap = new HashMap<>();

        stringMap.put("SV001", new Student(1, "Công", 5.5));
        stringMap.put("SV002", new Student(1, "Sang", 2.3));

        Set<String> integerSet = stringMap.keySet();
        for (String key : integerSet) {
            System.out.printf("%s - %s\n", key, stringMap.get(key));
        }
    }
}
