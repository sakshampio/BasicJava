package weekIII.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> mp1  = new HashMap<>();
        mp1.put("vishal",23);
        mp1.put("vaibhav",20);
        mp1.put("harshit",null);
        System.out.println(mp1);
        mp1.put("harshit",22);
        System.out.println(mp1);
        System.out.println("contains vishal : " + mp1.containsKey("vishal"));
        System.out.println("vishal's age "+ mp1.get("vishal"));

        // iteration in hashmap
        Set<String> names = mp1.keySet();
        for(String name : names){
            System.out.println("name: " + name + " , age: " + mp1.get(name));
        }
        // iteration using enteryset
        Set<Map.Entry<String , Integer>> s = mp1.entrySet();
        for(Map.Entry<String , Integer> it : s ){
            System.out.println("name: " + it.getKey() + " , age: " + it.getValue());
        }
        //
        names.remove("vishal");
        System.out.println(mp1);

        Map<String,Map<String,Integer>> mp = new HashMap<>();
        Map<String,Integer>pro = new HashMap<>();
         pro.put("saksham",19);
         pro.put("rohan",23);
         mp.put("rishabh",mp1);
         mp.put("saransh",pro);
        System.out.println(mp);
             }
}
