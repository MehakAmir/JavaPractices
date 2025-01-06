package map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> H1 = new HashMap<>();

        
        H1.put(1, "mehak");
        H1.put(2, "sehar");
        H1.put(3, "wasiq");

        
        System.out.println(H1);
        
        System.out.println("Value for key 2 " + H1.get(2));

        System.out.println("Contains key 3 " + H1.containsKey(3));

        System.out.println("Contains value 'mehak' " + H1.containsValue("mehak"));
        H1.remove(1);
        System.out.println("Updated map " +H1);
        
        H1.putIfAbsent(4, "zara");
        System.out.println(H1);
    }
}

