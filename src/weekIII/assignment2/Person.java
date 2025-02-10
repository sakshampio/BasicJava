package weekIII.assignment2;
import java.io.*;
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private String address;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void display(){
        System.out.println("Name: " + name + "  age: "+ age + "  address: "+ address);
    }
}
