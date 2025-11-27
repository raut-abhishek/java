// Implementation of Stack using ArrayList in Java

import java.util.ArrayList;


class Stack {
    private ArrayList<Integer> list = new ArrayList<>();

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return list.remove(list.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}


public class StackInArraylist {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top = " + s.peek()); 
        System.out.println("Popped = " + s.pop()); 
        System.out.println("Top now = " + s.peek());
        System.out.println("Size = " + s.size());
    }
}
