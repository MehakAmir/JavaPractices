package Interface;

interface Calculator {
    int multiply(int a, int b); // Abstract method

    // Default method
    default int square(int a) {
        return a * a;
    }

    // Static method
    static int add(int a, int b) {
        return a + b;
    }
}
public class FunctionalStatic {
    public static void main(String[] args) {
        Calculator calc = (a, b) -> a * b;

        
        System.out.println("Multiplication: " + calc.multiply(5, 3));  
       
        System.out.println("Square: " + calc.square(4));  

        System.out.println("Addition: " + Calculator.add(5, 3));  
    }
}

//interface InvalidFunctionalInterface {
//    void method1();
//    void method2(); // Compilation error: Multiple abstract methods
//}

//@FunctionalInterface
//interface AnotherInvalidInter extends Calculator {
//    void method3();  // Error: Inheriting multiple abstract methods
