// Implementation of HashMap using Array of Linked Lists

class MyHashMap {

    
    static class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] buckets;
    private int size = 0;     
    private int capacity = 10; 

    MyHashMap() {
        buckets = new Node[capacity];
    }

    
    private int getBucketIndex(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    
    public void put(String key, int value) {
        int index = getBucketIndex(key);
        Node head = buckets[index];


        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }


        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    
    public Integer get(String key) {
        int index = getBucketIndex(key);
        Node head = buckets[index];

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        return null; 
    }

    
    public void remove(String key) {
        int index = getBucketIndex(key);
        Node head = buckets[index];
        Node prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null)
                    buckets[index] = head.next;
                else
                    prev.next = head.next;
                size--;
                return;
            }

            prev = head;
            head = head.next;
        }
    }


    public void printMap() {
        for (int i = 0; i < capacity; i++) {
            Node head = buckets[i];
            System.out.print(i + " -> ");

            while (head != null) {
                System.out.print("[" + head.key + ":" + head.value + "] -> ");
                head = head.next;
            }

            System.out.println("null");
        }
    }
}


public class HashMapInArrayLL {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put("India", 140);
        map.put("US", 40);
        map.put("China", 130);
        map.put("India", 150); // update

        System.out.println("US population = " + map.get("US"));
        System.out.println("India population = " + map.get("India"));

        map.remove("US");

        map.printMap();
    }
}
