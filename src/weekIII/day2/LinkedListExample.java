package weekIII.day2;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();


                ll.add("A");
                ll.add("B");
                ll.addLast("C");
                ll.addFirst("D");
                ll.add(2, "E");

                System.out.println(ll);


                ll.remove(3);
                ll.removeFirst();
                ll.removeLast();

                System.out.println(ll);
            }
        }

