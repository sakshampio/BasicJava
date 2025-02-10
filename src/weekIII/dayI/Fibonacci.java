package weekIII.dayI;

public class Fibonacci {
    int n1 = 0, n2 = 1, n3 = 0;

    public void fibo(int cnt) {
        if (cnt > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3); // Moved inside the if block
            fibo(cnt - 1);
        }
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int cnt = 15;
        System.out.print(f.n1 + " " + f.n2); // Changed to print
        f.fibo(cnt - 2);
    }
}