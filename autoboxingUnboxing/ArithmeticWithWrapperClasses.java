package autoboxingUnboxing;

public class ArithmeticWithWrapperClasses {
    public static void main(String[] args) {
        // Autoboxing with Integer
        Integer a = 10;
        Integer b = 20;
        
        int sum = a + b;  
        System.out.println("Sum: " + sum);

        // Arithmetic with Double
        Double d1 = 15.5;
        Double d2 = 10.5;
        
        double result = d1 + d2;  
        System.out.println("Sum of Doubles: " + result); 

        // Arithmetic with Boolean 
        Boolean b1 = true;
        Boolean b2 = false;
        
        boolean logicalResult = b1 || b2; 
        System.out.println("Logical OR: " + logicalResult);  
    }
}
