class Example1{
    Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }  

    // add- first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addlast(String data){
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

    // print list
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");

    }

    // delete first node
    public void deleteFirst(){
        Node currNode = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = currNode.next;

    }

    public static void main(String[] args){
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
    }
}