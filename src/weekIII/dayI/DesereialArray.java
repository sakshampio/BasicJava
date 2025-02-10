package weekIII.dayI;

import java.io.*;

public class DesereialArray {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/weakIII/dayI/ob.txt"))) {
            int[] deserializedArray = (int[]) in.readObject();
            for (int num : deserializedArray) {
                System.out.print(num + " ");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
