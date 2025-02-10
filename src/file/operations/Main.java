package file.operations;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        // character stream will read only one character at a time
        try(InputStreamReader isr = new InputStreamReader(System.in)){// here system.in taking input from user
            System.out.println("enter some letter:");
            int letter = isr.read();
//            The ready() method checks if the input stream is ready to be read. However, the ready() method doesn't indicate the end of the input properly when reading from System.in. It usually works fine when reading from a file or other input sources.
            while(isr.ready()){
                System.out.println((char) letter);
                letter = isr.read();
            }
            isr.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
