package file.assignment;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class AppendOnExistingFile {

        public static void main(String[] args) {

            try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/file/assignment/one.txt", true))) {// this true will append the content to the file
                bw.newLine();// this will add newline

                bw.write("hiiiiiiiiiiiiiii");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

