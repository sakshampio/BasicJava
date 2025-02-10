package exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FinallyBlock {



        public static void main(String[] args) {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader("example.txt"));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            } finally {
                try {
                    if (br != null) {
                        br.close();
                    }
                } catch (IOException e) {
                    System.out.println("Error closing the BufferedReader: " + e.getMessage());
                }
                System.out.println("This is the finally block.");

        }
    }
}
