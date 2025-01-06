package sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterationExample {

    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();
        set.add("mehak");
        set.add("ali");
        set.add("noor");
        set.add("haroon");

        // for-each loop
        System.out.println("Using for-each loop:");
        for (String name : set) {
            System.out.println(name);
        }

        // Iterating using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

