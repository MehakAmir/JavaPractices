package map;

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>();
        originalMap.put("A", "Apple");
        originalMap.put("B", "Banana");
        originalMap.put("C", "Cherry");
        
        System.out.println("Original Map: " + originalMap);

        // Reversing the keys and values
        Map<String, String> reversedMap = new HashMap<>();
        for (Map.Entry<String, String> entry : originalMap.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }
        
        System.out.println("Reversed Map: " + reversedMap);
    }
}

