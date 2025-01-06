package list;

import java.util.ArrayList;

public class ArrayListWithObjects {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();

    
        names.add("mehak");
        names.add("noor");
        names.add("zainab");
        System.out.println("Name at index 1: " + names.get(1));
        
        System.out.println("All names in the list:");
        for (String name : names) {
            System.out.println(name);
        }

        names.add(1, "sara");
        System.out.println("Names after adding 'noor' at index 1: " + names);
    }
}

