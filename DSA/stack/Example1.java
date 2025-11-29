import java.util.ArrayList;

public class Example1 {

    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();
        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (list.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.remove(list.size() - 1);
        }

        public int peek() {
            if (list.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }

        public boolean isEmpty() {
            return list.isEmpty();
        }
    }
     public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());
        System.out.println(stack.pop()); 
        System.out.println(stack.peek());
    }
}
