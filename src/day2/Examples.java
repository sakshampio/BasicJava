package day2;
import java.lang.*;

public class Examples {
    public static void main(String[] args) {
         Complex c1 =  new Complex();
         c1.a = 5;
         c1.b = 3;
         c1.print(2);
    }
}
class Complex{
    int a; int b;
    void print(){
        System.out.println(a + " + "+b+ "i");
    }
    void print(int a ){
        System.out.println("This is method overloading");
    }

        }

