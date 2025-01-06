package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
       
        List<String> fruits = new LinkedList<>();
        
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        
        
        System.out.println("LinkedList: " + fruits);
        
       
        System.out.println("Element at index 1: " + fruits.get(1));
        
        fruits.remove("Banana"); 
        System.out.println("LinkedList after removal: " + fruits);
           
        System.out.println(fruits.contains("Apple"));
     
        System.out.println("Size of LinkedList: " + fruits.size());
    }
}
