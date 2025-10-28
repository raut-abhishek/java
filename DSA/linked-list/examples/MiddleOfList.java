// find middle node of linked list

public class MiddleOfList{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public Node middleNode(){
        Node slow = head;
        Node fast = head;
        while(fast != null  && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        MiddleOfList list = new MiddleOfList();
        list.addLast("10");
        list.addLast("20");
        list.addLast("30");
        list.addLast("40");
        list.addLast("50");
        System.out.println("New list:");
        list.printList();

        Node middleNode = list.middleNode();

        System.out.println("Middle node is: " + middleNode.data);
    }
}
