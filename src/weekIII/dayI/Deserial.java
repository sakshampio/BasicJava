package weekIII.dayI;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("src/weakIII/dayI/ob.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // deserealization
          Student s1 =  (Student)ois.readObject(); // this is used to desearilization here copy of object is created.

            System.out.println(s1.getName());
            System.out.println(s1.getAge());
            System.out.println(s1.getEmail());
        }
        catch(ClassNotFoundException c){
            c.getMessage();
        }
        catch(IOException e){
            e.getMessage();
        }
    }

}
