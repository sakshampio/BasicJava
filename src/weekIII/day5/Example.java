package weekIII.day5;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Example {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq =  new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(21);
        pq.add(12);
        pq.add(24);
        pq.add(34);
        pq.add(15);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
