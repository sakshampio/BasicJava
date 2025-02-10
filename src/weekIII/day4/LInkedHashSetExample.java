package weekIII.day4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LInkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("raj");
        set1.add("john");
        set1.add("anita");
        System.out.println(set1);
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("john");
        set2.add("raj");
        set2.add("anita");
        System.out.println(set2);
    }

}
