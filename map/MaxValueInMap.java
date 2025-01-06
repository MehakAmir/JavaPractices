package map;

import java.util.HashMap;
import java.util.Map;

public class MaxValueInMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 50);
        map.put("B", 30);
        map.put("C", 70);
        map.put("D", 40);

        System.out.println("Map: " + map);

        // Find the entry with the maximum value
        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        System.out.println("Max value " + maxEntry.getValue() + " for key " + maxEntry.getKey());
    }
}

