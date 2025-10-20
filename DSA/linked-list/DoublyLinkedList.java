// Conversion of array into Doubly Linked List

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyList{



    Node head;
    Node tail;

    DoublyList(){
        this.head = null;
        this.tail = null;
    }
}



public class DoublyLinkedList{

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
        System.out.println();
    }

    public static Node convertArrToDLL(int[]arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;

    }


    public static void main(String[] args) {
        // DoublyList dll = new DoublyList();
        int[] arr = {1,2,3,4,5};
        Node head = convertArrToDLL(arr);
        printList(head);
    }
}