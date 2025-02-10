package weekIII.day2;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static void Reverse (ArrayList<Integer>list) {
        Collections.reverse(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("list before reverse"+list);
        Reverse(list);
        System.out.println("list after reverse"+list);

    }
}
