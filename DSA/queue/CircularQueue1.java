// implementation of a circular queue using an array


class CircularQueue {
    int[] arr;
    int front, rear, size, capacity;

    public CircularQueue(int cap) {
        capacity = cap;
        arr = new int[cap];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue Full");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Empty");
            return -1;
        }
        int val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    public int peek() {
        if (size == 0) return -1;
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}

public class CircularQueue1 {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

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
    }
}
