// creating linked list using java built in linked list method

import java.util.LinkedList;

public class BuiltInLinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Tata");
        fruits.add("Suzuki");
        fruits.add("Honda");

        System.out.println("Car Brand : " + fruits);

        fruits.addFirst("BMW");  
        fruits.addLast("Mahindra");  

        System.out.println("After adding : " + fruits);

        fruits.remove("Suzuki");
        System.out.println("After removing Suzuki : " + fruits);
    }
}
