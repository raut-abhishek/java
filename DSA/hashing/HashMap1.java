// iteration in HashMap

import java.util.*;


public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap <>();

        // Adding key-value pairs to HashMap
        map.put("India", 140);
        map.put("US", 40);
        map.put("Chaina", 120);

        System.out.println(map);


        // search for a key
        if(map.containsKey("India")){
            System.out.println("India is present in the map");
        } else {
            System.out.println("India is not present in the map");
        }

        if(map.containsKey("UK")){
            System.out.println("UK is present in the map");
        } else {
            System.out.println("UK is not present in the map");
        }


        // search for a value

        System.out.println(map.get("US"));
        System.out.println(map.get("UK"));


        // Iterating through the HashMap
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        } 


        // Another way to iterate through the HashMap
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }


    }
}
