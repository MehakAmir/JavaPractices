package list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();


        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        
        System.out.println("Element at index 0: " + numbers.get(0));
        System.out.println("Element at index 2: " + numbers.get(2));
        System.out.println("All elements in the ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Removing an element
        numbers.remove(Integer.valueOf(30));
        System.out.println("ArrayList after removal of 30: " + numbers);
    }
}

