package ss17_binary_file.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class FileInputStudy2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // ================ Read ================
        List<String> strings;

        try {
            FileInputStream fileInputStream = new FileInputStream("src/ss17_binary_file/data/data.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            strings = (List<String>) objectInputStream.readObject();
            System.out.println(strings.get(0));
            System.out.println(strings.get(1));

            objectInputStream.close();
        } catch (EOFException e) {
            strings = new ArrayList<>(); // 0 phần t
        }

        //  ================ Add vào list ================


        // ================ Write ================

        System.out.println("Số lượng phần tử: " + strings.size());
    }
}
