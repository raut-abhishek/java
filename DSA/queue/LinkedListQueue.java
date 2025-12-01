// A queue implementation using a linked list


class LLQueue {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    Node front, rear;

    void enqueue(int x) {
        Node newNode = new Node(x);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue Empty");
            return -1;
        }

        int val = front.data;
        front = front.next;

        if (front == null) rear = null;

        return val;
    }

    int peek() {
        if (front == null) return -1;
        return front.data;
    }

    boolean isEmpty() {
        return front == null;
    }
}



public class LinkedListQueue {
    public static void main(String[] args) {
        LLQueue queue = new LLQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); 
        System.out.println(queue.peek());    
        System.out.println(queue.isEmpty()); 
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
        System.out.println(queue.isEmpty()); 
    }
}
