// A simple implementation of a queue using an array

class ArrayQueue {
    int[] arr;
    int front;
    int rear;
    int capacity;

    public ArrayQueue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    public void enqueue(int x) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = x;
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front++];
    }

    public int peek() {
        if (front > rear) return -1;
        return arr[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }
}
public class Example1 {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element is: " + queue.peek());

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        System.out.println("Front element is: " + queue.peek());

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        queue.dequeue();
    }
}