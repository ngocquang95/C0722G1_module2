package ss17_binary_file.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileInputStudy1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // ================ Write ================
        FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_binary_file/data/data.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

//        String name = "hello";
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Đức Vịnh");
        objectOutputStream.writeObject(stringList);
//        objectOutputStream.writeObject("Hello");
//        objectOutputStream.writeObject("Đức Vịnh");

        objectOutputStream.close();

        // ================ Read ================
        FileInputStream fileInputStream = new FileInputStream("src/ss17_binary_file/data/data.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<String> strings = (List<String>) objectInputStream.readObject();
        System.out.println(strings.get(0));
        System.out.println(strings.get(1));

        objectInputStream.close();
    }
}
