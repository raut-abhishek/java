// Example of HashSet and its operations


import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //insert elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);  // duplicate element


        // search-contains
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }

        // delete element
        set.remove(2);
        System.out.println("Deleted 2 from the set");


        // Check size
        System.out.println("Size of the set: " + set.size());

        // Print all elements
        System.out.println("Elements in the set: " + set);


        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        // iterate through set
        System.out.print("Iterating through set: ");
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }


    }
}