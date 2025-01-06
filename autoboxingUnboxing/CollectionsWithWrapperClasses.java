package autoboxingUnboxing;

import java.util.*;

public class CollectionsWithWrapperClasses {
    public static void main(String[] args) {
        // Using List with Wrapper Classes
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);  
        integerList.add(20);  
        integerList.add(30);  
        System.out.println("List with Integer Wrapper: " + integerList);

        // Using Set with Wrapper Classes
        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(10.5);  
        doubleSet.add(20.5);  
        doubleSet.add(30.5);  
        System.out.println("Set with Double Wrapper: " + doubleSet);

        // Using Map with Wrapper Classes
        Map<Character, Boolean> map = new HashMap<>();
        map.put('A', true);  // Autoboxing: char to Character, boolean to Boolean
        map.put('B', false);
        System.out.println("Map with Character and Boolean: " + map);
    }
}

