package file.operations;

import java.io.OutputStreamWriter;

public class OutputStreamWriterExample {
    public static void main(String[] args) {
//        OutputStream os = System.out;
//        os.write(2); exceds the limit
        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write(32);// this will print only char
            osw.write("hello world");
            osw.write(10);
            char [] arr = "hello world".toCharArray();
            osw.write(arr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
