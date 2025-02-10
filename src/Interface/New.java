package Interface;

public class New extends AbstractA implements InterfaceA, InterfaceB{
    public void bar()
    {
        System.out.println("this is new class");
    }

    public static void main(String[] args) {
InterfaceB b = new New();
b.foo();
//b.bar();
    }
}

