package autoboxingUnboxing;

public class AutoboxingUnboxingWithOtherWrappers {
    public static void main(String[] args) {
        // Autoboxing with Double
        double d = 15.5;
        Double doubleObj = d;  
        System.out.println("Autoboxing with Double:");
        System.out.println("Primitive: " + d);
        System.out.println("Wrapper: " + doubleObj);

        // Unboxing with Double
        Double doubleObj2 = 30.5;
        double d2 = doubleObj2;  
        System.out.println("\nUnboxing with Double:");
        System.out.println("Wrapper: " + doubleObj2);
        System.out.println("Primitive: " + d2);

        // Autoboxing with Character
        char c = 'A';
        Character charObj = c;  
        System.out.println("\nAutoboxing with Character:");
        System.out.println("Primitive: " + c);
        System.out.println("Wrapper: " + charObj);

        // Unboxing with Character
        Character charObj2 = 'B';
        char c2 = charObj2;  
        System.out.println("\nUnboxing with Character:");
        System.out.println("Wrapper: " + charObj2);
        System.out.println("Primitive: " + c2);

        // Autoboxing with Boolean
        boolean b = true;
        Boolean boolObj = b; 
        System.out.println("\nAutoboxing with Boolean:");
        System.out.println("Primitive: " + b);
        System.out.println("Wrapper: " + boolObj);

        // Unboxing with Boolean
        Boolean boolObj2 = false;
        boolean b2 = boolObj2;  
        System.out.println("\nUnboxing with Boolean:");
        System.out.println("Wrapper: " + boolObj2);
        System.out.println("Primitive: " + b2);
    }
}
