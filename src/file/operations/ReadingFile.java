package file.operations;

import java.io.FileReader;


public class ReadingFile {
    public static void main(String[] args) {
        // character stream will read only one character at a time
        try(FileReader fr = new FileReader("src/file/handeling/note.txt")){
            System.out.println("enter some letter:");
            int letter = fr.read();

            while(fr.ready()){
                System.out.println((char) letter);
                letter = fr.read();
            }
           fr.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
