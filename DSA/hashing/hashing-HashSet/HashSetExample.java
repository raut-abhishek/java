// Example of using HashSet in Java

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();


        set.add("apple");
        set.add("banana");
        set.add("mango");
        set.add("apple");


        System.out.println(set);

      
        System.out.println("Contains mango? " + set.contains("mango"));

        
        set.remove("banana");

       
        System.out.println(set);


        System.out.println("Size: " + set.size());
    }
}
