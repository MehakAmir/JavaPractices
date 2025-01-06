package map;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Orange", 60);
        System.out.println(map);
       
        System.out.println("Price of Apple " + map.get("Apple"));
        
        System.out.println( map.containsKey("Banana"));
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

      
        map.remove("Banana");
        System.out.println(map);
        
        System.out.println("Size of map: " + map.size());
    }
}

