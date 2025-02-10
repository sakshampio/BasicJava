package file.assignment;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class CountFreq {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/file/assignment/one.txt"))) {
            Map<String, Integer> map = new HashMap<>();
            String line;

            while ((line = br.readLine()) != null) {
                Scanner sc = new Scanner(line);
                while (sc.hasNext()) {
                    String word = sc.next();
//                    word = word.replaceAll("[^a-zA-Z0-9]", ""); // Remove punctuation
                    map.put(word, map.getOrDefault(word, 0) + 1);
                }
                sc.close();
            }

            // Print the word count
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
