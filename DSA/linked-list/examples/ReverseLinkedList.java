class ReverseLinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add node to end
    public void addToEnd(String data) {
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

    // reverse the linked List
    public void ReverseList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // print list
    public void PrintList() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.addToEnd("10");
        list.addToEnd("20");
        list.addToEnd("30");
        list.addToEnd("40");
        list.addToEnd("50");
        System.out.println("New list:");
        list.PrintList();

        
        System.out.println("After reversing the List:");
        list.ReverseList();
        list.PrintList();
    }
}