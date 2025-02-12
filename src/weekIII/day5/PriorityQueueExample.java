package weekIII.day5;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample  {
    public static void main(String[] args) {
        Queue<Customer> pq1 =  new PriorityQueue<>();
        pq1.add(new Customer("vishal",500, 1));
        pq1.add(new Customer("vaibhav",200, 4));
        pq1.add(new Customer("vishal",5300, 3));
        pq1.add(new Customer("vishal",5100, 2));
        System.out.println(pq1);
        System.out.println(pq1.remove());
        System.out.println(pq1);
    }


}
