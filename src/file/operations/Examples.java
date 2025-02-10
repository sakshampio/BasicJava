package file.operations;

import java.io.File;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {
        // crearing a file
        try{
            File fo = new File("src/file/handeling/next.txt");
            fo.createNewFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        // writing in a file
        try(FileWriter fw = new FileWriter("src/file/handeling/next.txt")){
            fw.write("this is my examples.what can we do for this ");
//            fw.newLine(); this method is not present in file writer it ie in bufferedfilewriter
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        // reading a file using scanner
//        next(): Finds and returns the next complete token.
//
//                nextLine(): Moves the scanner past the current line and returns the input that was skipped.
//
//        nextInt(): Scans the next token of the input as an int.
//
//                nextDouble(): Scans the next token of the input as a double.
//
//                Boolean Methods
//        hasNext(): Returns true if the scanner has another token in its input.
//
//        hasNextLine(): Returns true if there is another line in the input.
//
//                hasNextInt(): Returns true if the next token in the scanner's input can be interpreted as an int.
        try {
            File f = new File("src/file/handeling/next.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());

        }

    }

}
