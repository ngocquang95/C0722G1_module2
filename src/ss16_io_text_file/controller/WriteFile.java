package ss16_io_text_file.controller;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ss16_io_text_file/data/output.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        bufferedWriter.write("CodeGym\n");
        bufferedWriter.write("CodeGym 2");
        bufferedWriter.newLine();
        bufferedWriter.write("CodeGym 3");

        bufferedWriter.close();
    }
}
