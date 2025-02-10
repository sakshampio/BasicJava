package file.assignment;

import java.io.*;
import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        String longestStr = "";
       try{  File f = new File("src/file/assignment/one.txt") ;
           Scanner sc = new Scanner(f);

           while(sc.hasNext() ){
               String str = sc.next();
               if(str.length() > longestStr.length()){
                   longestStr = str;
               }

           }
         sc.close();
       } catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
       }
        System.out.println("the longest word is : " + longestStr );

    }
}
