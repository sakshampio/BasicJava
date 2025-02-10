package weekIII.dayI;
import java.util.Scanner;
public class Factorial {
    public   int factorial(int n ){
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
}
    public static void main(String[] args) {
        Factorial fc = new Factorial();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the factorial is " + fc.factorial(n));
    }
}
