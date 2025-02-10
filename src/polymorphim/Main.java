package polymorphim;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        Shapes c = new Circle();
        Square s1 = new Square();

        s.area();// the method which he has to access is depends on  it's reference type.
        c.area();
    }

}
 