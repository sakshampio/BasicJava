package weekIII.dayI;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
     private static int age;
    transient private String email;


    public Student(String name , int age, String email ){
        this.name = name;
        this.age = age;
        this.email =email;
    }
    public Student(){}

    public String getName(){
        return name;
    }

    public void setName(String name ){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age ){
        this.age = age;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email ){
        this.email = email;
    }
    public void display(){
        System.out.println("my name is " + this.name);
    }





}
