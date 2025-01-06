package autoboxingUnboxing;

import java.util.ArrayList;

public class AutoboxingUnboxingExample {

    public static void main(String[] args) {
        // Autoboxing
        int num1 = 100;
        Integer integer1 = num1; 
        
        // Printing values
        System.out.println("Autoboxing:");
        System.out.println("Primitive: " + num1);
        System.out.println("Wrapper: " + integer1);
        
        // Unboxing
        Integer integer2 = 50;
        int num2 = integer2; 
        
        // Printing values
        System.out.println("\nUnboxing:");
        System.out.println("Wrapper: " + integer2);
        System.out.println("Primitive: " + num2);

        // Example with a Collection
        System.out.println("\nAutoboxing with Collection:");
     
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);  
        list.add(20);  
        System.out.println("ArrayList: " + list);

        
        System.out.println("\nArithmetic Operations:");
        Integer integer3 = 30;
        Integer integer4 = 10;
        
        int sum = integer3 + integer4; 
        System.out.println("Sum: " + sum); 

     
        System.out.println("\nUnboxing with Null (throws NullPointerException):");
        try {
            Integer nullInteger = null;
            int unboxedValue = nullInteger; 
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }
    }
}

