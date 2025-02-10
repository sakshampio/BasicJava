package weekIII.day2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void demo(){
        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("list1 :" + list1);
        list1.remove(3);
        list1.remove(3);
        System.out.println("list1 :" + list1);
        list1.add(0,12);
        list1.set(1,23);
        System.out.println("list1 :" + list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        // bulk operation
        list1.removeAll(list2);
        System.out.println("list1 :" + list1);
        list2.add(1);

//        list1.retainAll(list2);
//        System.out.println("list2 :" + list1);

// search operation
        System.out.println("the list one is" + list1);
        System.out.println(list1.contains(1));
        System.out.println(list1.indexOf(1));
        System.out.println(list1.lastIndexOf(1));

        //range view
        List<Integer>list3 = list1.subList(2,3);
        list3.set(0,11);
        System.out.println(list1);
        //iteration
        for(int it : list1){
            System.out.println("element is: "+it);
        }
    }

    public static void main(String[] args) {
        ArrayListExample.demo();
    }
}
