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
}


public class Operations {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert at beginning
        list.insertAtBeginning(5);
        System.out.println("\nAfter inserting 5 at beginning:");
        list.display();

    }
}
