package map;

import java.util.*;
//order 
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> L1 = new LinkedHashMap<>();

        
        L1.put(1, "Apple");
        L1.put(2, "Banana");
        L1.put(3, "Orange");

        // Print insertion order
        System.out.println("LinkedHashMap in insertion order:");
        for (Map.Entry<Integer, String> entry : L1.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
//maintains the order in which elements were added to the map
