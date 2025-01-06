package exaption;

public class Ex {
	    public static void main(String[] args) {
	     
	        try {
	            System.out.println("Try block executed.");
	        } finally {
	            System.out.println("Finally block starts.");
	            // This line will throw an ArithmeticException
	            int result = 10 / 0;
	            System.out.println("This will not execute.");
	        }
	    }
	}
	 
