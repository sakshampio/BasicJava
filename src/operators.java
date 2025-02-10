// operators and scanner class and if else statement
import java.util.Arrays;
import java.util.Scanner;
public class operators {
    public static void main(String [] args){
//        System.out.println((int)(100 * Math.random()));// using of random no.


         // taking user input
        Scanner sc = new Scanner(System.in);
////        System.out.println("input your age : ");
////        float age = sc.nextFloat();//bool to input float char int
//        System.out.println("input your name  : ");
//        String name = sc.nextLine();//to input string without space
//        System.out.println(name);
//
//        // if-else statement
//
//        boolean issun = false;
//        if(issun == true){
//            System.out.println("it is day");}
//        else {
//            System.out.println("it is night ");
//        }

  // switch case
//        Scanner s =  new Scanner(System.in);
//        System.out.println("enter day value in int");
//        int day = s.nextInt();
//        switch (day){
//            case 1 :
//                System.out.println("monday"); break;
//            case 2 :
//                System.out.println("Tuesday");break;
//            case 3 :
//                System.out.println("Wednesday");break;
//            case 4 :
//                System.out.println("Thrusday");break;
//            case 5 :
//                System.out.println("Friday");
//                defualt :
//                System.out.println("wrong input");
//
//
//        }

        // do while loops
        int number  = sc.nextInt();;
        do
        {


            System.out.println("The no. is :-");
            System.out.println(number);
            number--;

        } while(number>0);
        System.out.println("the end");


    }

}
