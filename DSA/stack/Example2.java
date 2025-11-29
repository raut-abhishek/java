public class Example2 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node top = null;

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        public int peek() {
            if (top == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    public static void main(String[] args) {
        Stack list = new Stack();
        list.push(5);
        list.push(15);
        list.push(25);

        System.out.println(list.peek());
        System.out.println(list.pop());
        System.out.println(list.peek());
    }
}
