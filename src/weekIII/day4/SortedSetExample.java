package weekIII.day4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public abstract class SortedSetExample {


    public static void main(String[] args) {
        ScoreCard s1 = new ScoreCard("iyer", 59);
        ScoreCard s2 = new ScoreCard("hardik", 9);
        ScoreCard s3 = new ScoreCard("rohit", 02);
        ScoreCard s4 = new ScoreCard("gill", 87);

        Set<String> set1 = new TreeSet<>();
        set1.add(String.valueOf(s1));
        set1.add(String.valueOf(s2));
        set1.add(String.valueOf(s3));
        set1.add(String.valueOf(s4));

        System.out.println(set1);


    }


}


