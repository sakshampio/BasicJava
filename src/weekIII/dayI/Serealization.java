package weekIII.dayI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serealization {
    public static void main(String[] args) {
        try{
            Student s1 = new Student("saksham", 20,"gargs3391@gmail.com") ;
            // to store byte stream
            FileOutputStream fos = new FileOutputStream("src/weakIII/dayI/ob.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);// this will convert object data to byte data after that it w ill store in ob.txt file

            // doing searilizing
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("object state is transferred to file object");

        }catch(IOException e ){
            e.getMessage();
        }
    }



}
