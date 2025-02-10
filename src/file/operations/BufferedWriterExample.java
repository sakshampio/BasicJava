package file.operations;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/file/handeling/note.txt", true))) {// this true will append the content to the file
          bw.newLine();// this will add newline

            bw.write("hiiiiiiiiiiiiiii");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
