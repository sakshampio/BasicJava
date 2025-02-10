package day2;
import java.lang.*;

public class LearnConstructor {
    public static void main(String[] args) {
     Complex1 n1 = new Complex1(2,4);
     Complex1 n2 = new Complex1(5,7);
     n1.print();
     n2.print();
     System.out.println("adding two no.");
        System.out.println(n2);
     Complex1 res = n1.add(n2);
      res.print();
    }
}
class Complex1{
    int a , b;
    public Complex1(int a, int b){
        this.a = a;
        this.b = b;
    }

    void print(){
        System.out.println(a+ "+"+b+"i");
    }
    Complex1 add(Complex1 n2){
        System.out.println(this);// here this s storing the reference of object
        return new Complex1(a + n2.a , b+n2.b);
    }


}
