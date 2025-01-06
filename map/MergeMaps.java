package map;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("C", 3);
        map2.put("D", 4);

        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);

        // Merging map2 into map1
        map1.putAll(map2);

        System.out.println("Merged Map: " + map1);
    }
}

