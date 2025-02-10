package file.operations;

import java.io.FileWriter;

public class OutputStreamFileWriterExample {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("src/file/handeling/note.txt", true)){// this true will append the content to the file
            fw.write("this should be appended");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
