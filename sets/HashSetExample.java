package sets;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
    
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");
        
        // Trying to add a duplicate element
        boolean isAdded = set.add("Banana");  
        System.out.println("Banana added again: " + isAdded);

        // Display the HashSet
        System.out.println("HashSet elements: " + set);

        // Check element is present in the HashSet
        boolean containsApple = set.contains("Apple");
        System.out.println("Does the set contain Apple? " + containsApple);

        // Remove an element 
        set.remove("Mango");
        System.out.println("After removing Mango: " + set);

        // Get size
        System.out.println("Size of the HashSet: " + set.size());

        // Check if the HashSet is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);

        // Clear all elements from the HashSet
        set.clear();
        System.out.println("After clearing, HashSet: " + set);
    }
}

