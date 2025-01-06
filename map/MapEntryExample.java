package map;

import java.util.*;

public class MapEntryExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("mehak", 30);
        map.put("noor", 25);

        // Iterating using Map.Entry
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

