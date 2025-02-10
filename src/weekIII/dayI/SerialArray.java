package weekIII.dayI;

import java.io.*;

public class SerialArray implements Serializable{
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30, 40, 50};

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/weakIII/dayI/ob.txt"))) {
            out.writeObject(intArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
