package day2;

public class Employee {
    String name;
     int id = 2;
//    final int id = 2;
     static String ceo;
    public Employee(){
        name = "vaibhav";
        id = 100;// this will generate an error here if assign final keyword to id


    }
    static {
        ceo = "vishal";
    }
    void show(){
        System.out.println(name + " :" + id + "  :" + ceo);
    }

}
