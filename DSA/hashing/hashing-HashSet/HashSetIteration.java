//iterating over a HashSet using for-each loop and Iterator


import java.util.*;

public class HashSetIteration {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();


        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); 

        System.out.println(set);

        System.out.println("Iterating using for-each loop:");
        for (Integer num : set) {
            System.out.println(num);
        }

        System.out.println("Iterating using Iterator:");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
