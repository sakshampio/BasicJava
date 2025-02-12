package weekIII.day5;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeExampe {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("vishal");
        deque.add("Rahul");
        deque.add("Rohan");
        System.out.println(deque);
        System.out.println(deque.remove());// this will remove first
        System.out.println(deque.remove());
        System.out.println(deque.remove());

        // stack implementation
        deque.push("vishal");
        deque.push("rahul");
        deque.push("rohan");
        System.out.println(deque);
        System.out.println(deque.pop());// this will remove last element
        System.out.println(deque.pop());
        System.out.println(deque.pop());
    }
}
