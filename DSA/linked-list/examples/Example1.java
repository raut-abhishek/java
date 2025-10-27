class Example1 {
    Node head;
    int size;

    Example1() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add- first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    // print list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");

    }

    // delete first node
    public void deleteFirst() {
        Node currNode = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = currNode.next;

    }

    // Delete last node
    public void deletelast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Example1 list = new Example1();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addlast("list");
        list.printList();

        System.out.println();
        System.out.println("After deleting the first node:");
        list.deleteFirst();
        list.printList();

        System.out.println();
        System.out.println("After deleting the last node:");
        list.deletelast();
        list.printList();

        System.out.println();
        System.out.println("Size of the list is: " + list.getSize());
    }
}