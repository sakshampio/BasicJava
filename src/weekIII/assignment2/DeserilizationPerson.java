package weekIII.assignment2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationPerson {
    public static void main(String[] args) {
          try(ObjectInputStream ios = new ObjectInputStream(new FileInputStream("src/weekIII/assignment2/new.txt"))) {
              Person p1 =  (Person)ios.readObject();
              p1.display();
          } catch (IOException e) {
              throw new RuntimeException(e);
          } catch (ClassNotFoundException e) {
              throw new RuntimeException(e);
          }
    }
    }



