package file.assignment;
import java.io.*;
import java.util.*;

public class ReverseFile {
    public static void main(String[] args) {
        try{
        File f = new File("src/file/assignment/two.txt");
        Scanner sc = new Scanner(f);
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/file/assignment/three.txt"));
        StringBuilder str = new StringBuilder();
        while(sc.hasNextLine()){
            str.append(sc.nextLine());
        }
        sc.close();
        str.reverse();
        bw.write(str.toString());
        bw.close();

    }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
