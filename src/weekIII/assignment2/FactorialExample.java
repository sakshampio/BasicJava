package weekIII.assignment2;
import java.util.Scanner;
import java.math.BigInteger;
public class FactorialExample {
    public static BigInteger factorial(int n ){
        if(n == 0 || n == 1 ){
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.println("enter a no.");
            int num = s.nextInt();
            if(num< 0){
                throw new  IllegalArgumentException("negative no. fact is not define");
            }
            if(num>1000){
                throw new  StackOverflowError("no. is too large");
            }
            BigInteger result = factorial(num);
            System.out.println("the fact is " + result);
        }catch (StackOverflowError e ){
            System.out.println("error: " + e.getMessage());
        }
        catch(Exception e ){
            e.getMessage();
        }
    }

}
