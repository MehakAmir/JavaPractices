package Interface;


interface MyFunction {
    int add(int a, int b); 

   
    default void greet() {
        System.out.println("Hello from default method!");
    }
}


public class FunctionalInterface {
	
	public class FunctionalInterfaceExample {
	    public static void main(String[] args) {
	  
	        MyFunction sum = (a, b) -> a + b;
	        System.out.println("Sum: " + sum.add(5, 3)); 
	        sum.greet();  
	    }
	}
}
