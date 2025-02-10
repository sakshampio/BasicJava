package day2;

public class StaticDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.show();
        Employee.ceo = "keshav";
        e1.show();
    }
}
