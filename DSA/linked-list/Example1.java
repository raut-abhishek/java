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

    // We Add element at end of the list
    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Display our list
    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " > ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Example1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.print();
    }
}
