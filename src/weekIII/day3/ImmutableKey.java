package weekIII.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImmutableKey {
    public static void main(String[] args) {
        List<Integer>list= new ArrayList<>();
        list.add(1);
        Map<List<Integer>,Integer> mp1 = new HashMap<>();
        mp1.put(list,1);
        System.out.println(mp1.get(list));
        list.add(2);
        System.out.println(mp1.get(list));

    }

}
