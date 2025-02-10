package weekIII.day4;

import java.util.ArrayList;
import java.util.List;

public class Mng {
    public static void main(String[] args) {
        String s1 = "happy";
        String s2 = "happy";
        String s3 = new String("happy");

        List<String> arr = new ArrayList<>();
        arr.add("2");
        arr.add("3");

        List<String> arr1 = new ArrayList<>();
        arr1.add("2");
        arr1.add("3");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(arr == arr1);
        System.out.println(arr.equals(arr1));


    }
}
