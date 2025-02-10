package weekIII.day2;

import java.util.LinkedList;

public class Main {
        public static void main(String[] args) {
            LinkList list = new LinkList();


            list.insertAtEnd(1);
            list.insertAtEnd(2);
            list.insertAtEnd(3);
            System.out.print("add ele at the end: ");
            list.printList();


            list.insertAtBeginning(0);
            System.out.print("add ele at start ");
            list.printList();


            list.insertAtPosition(5, 2);
            System.out.print("add ele at any pos: ");
            list.printList();

            // Insert element at the end
            list.insertAtEnd(6);
            System.out.print("adding ele at the end: ");
            list.printList();
        }
    }

