package weekIII.assignment2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListToLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Integer> l1= new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);

        // Convert ArrayList to LinkedList
        LinkedList<Integer> ll1 = new LinkedList<>(l1);


        System.out.println("Initial LinkedList: " + ll1);


        System.out.print("Enter element to add: ");
        int elementToAdd = scanner.nextInt();
        System.out.print("Enter position: ");
        int positionToAdd = scanner.nextInt();
        ll1.add(positionToAdd, elementToAdd);
        System.out.println("LinkedList after adding: " + ll1);


        System.out.print("Enter position to remove the element: ");
        int positionToRemove = scanner.nextInt();
        ll1.remove(positionToRemove);
        System.out.println("LinkedList after removing: " + ll1);

        System.out.println("Iterating through the LinkedList:");
        for (int ele : ll1) {
            System.out.println(ele);
        }
    }
}
