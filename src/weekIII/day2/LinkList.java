package weekIII.day2;

public class LinkList {

        Node head;

        // Insert at start
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Insert at the end
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        // Insert at any position
        public void insertAtPosition(int data, int position) {
            Node newNode = new Node(data);
            if (position == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node temp = head;
                for (int i = 0; i < position - 1 && temp != null; i++) {
                    temp = temp.next;
                }
                if (temp != null) {
                    newNode.next = temp.next;
                    temp.next = newNode;
                }
            }
        }

        // Print the linked list
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

