package strings;

public class StringConcatenation {
	public static void main(String[] args) {
        String str1 = "Java";
        str1 = str1 + " Programming";
        //original string "Java" is not modified
        System.out.println("After concatenation: " + str1); // Output: Java Programming
    
        String part1 = "Hello";
        String part2 = " world";
        String part3 = "!";
        
        String message1 = part1 + part2 + part3;
        System.out.println("Using + operator: " + message1);
        
        String message2 = part1.concat(part2).concat(part3);
        System.out.println("Using concat(): " + message2);
	
	
	}
}
