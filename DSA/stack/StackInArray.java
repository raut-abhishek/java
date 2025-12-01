// Stack implementation using Array


class StackArray{
    int [] arr;
    int top;
    int capacity;

    StackArray(int n){
        arr = new int[n];
        capacity = n;
        top = -1;
    }

    public void push(int data){
        if(top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];  
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity -1;
    }

}


public class StackInArray {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(100);
        stack.push(200);        
        stack.push(300);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
    
}
