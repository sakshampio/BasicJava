package inheritance;

public class Three extends Two  {
    public void printThree() {
        super.printTwo();
        System.out.println("three");
}
}
