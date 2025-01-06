package list;

import java.util.ArrayList;

public class ArrayListGenericExample {
    public static void main(String[] args) {
        // Create an ArrayList with different data types using Object class
        ArrayList<Object> mixedList = new ArrayList<>();
        
        
        mixedList.add(100);             
        mixedList.add("Hello World");   
        mixedList.add(3.14);            
        mixedList.add(true);            
        
        
        System.out.println("Mixed List: " + mixedList);
        
        
        System.out.println("First element: " + mixedList.get(0));
        System.out.println("Second element: " + mixedList.get(1));
    }
}
