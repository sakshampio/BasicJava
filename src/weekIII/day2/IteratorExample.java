package weekIII.day2;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("list : "+list);
        Iterator<Integer> it = list.iterator();


        while (it.hasNext()) {
            Integer element = it.next();
            if(element == 4){
                it.remove();// here we can perform remove operation in iterator
            }
            System.out.println(element);
        }
        System.out.println(list);

    }

}
