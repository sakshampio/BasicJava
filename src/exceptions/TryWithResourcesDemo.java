package exceptions;
import java.io.*;
import java.lang.Exception;

public class TryWithResourcesDemo {


    public static void main(String[] args) {


        try (BufferedReader in = new BufferedReader(new FileReader("src/exceptions/name.txt"));
             BufferedWriter out = new BufferedWriter(new FileWriter("src/exceptions/name-out.txt"))) {

            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}