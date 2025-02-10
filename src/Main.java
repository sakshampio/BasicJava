
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello world");
        System.out.println("hello java");
//        String name = "saksham";
//        System.out.println(name);
        long phone = 12345678900L;
        String name = new String("saksham");// string with new keyword
        String name1 = new String ("garg");

//        System.out.println(name.charAt(3));
        String name2 = name +" "+ name1; // concatination function of string

        System.out.println(name2.replace('a','z'));// replace function

        // use arrray in java
        int [] arr = new int[5];
        arr[0] =1;
        arr[1] =2;
        arr[2] =3;
        arr[3] =4;
        arr[4] =5;
//        int [] arr1 = {1,2,3,4,5}; alternate way of declearing array
        System.out.println(arr[2]);

        // sort operation of an array
        Arrays.sort(arr);// sorting an array
        System.out.println(arr[2]);

        // creating a 2d array
        int[][] mark = {{1,2,3},{6,4,5}};
        System.out.println(mark[1][1]);

        // explicit type casting
        int p = 100;
//        int z = p + 14.0;// it will create erroe so we have to do type casting for this error
        int z = p + (int)14.9;
        System.out.println(z);
    }
}