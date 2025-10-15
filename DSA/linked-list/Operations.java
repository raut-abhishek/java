// Operations on linked list 

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {


    Node head;
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    void deleteNode(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }

        Node curr = head;
        while (curr.next != null && curr.next.data != value) {
            curr = curr.next;
        }

        if (curr.next == null) {
            System.out.println("Value not found");
            return;
        }

        curr.next = curr.next.next;
    }

    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node curr = head;
        for (int i = 1; i < position - 1 && curr != null; i++) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Position out of range");
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

}


public class Operations {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert at beginning
        list.insertAtBeginning(5);
        System.out.println("\nAfter inserting 5 at beginning:");
        list.display();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        System.out.println("\nafter inserting at last:");
        list.display();

        list.deleteNode(40);
        System.out.println("\nAfter deleting 40:");
        list.display();

        // Insert at a perticular position
        list.insertAtPosition(25, 4);
        System.out.println("\nAfter inserting 25 at position 4:");
        list.display();

    }
}
