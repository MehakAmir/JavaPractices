package strings;

public class StringPerformance {
	public static void main(String[] args) {
	String str = "Hello";
    
    // Inefficient approach with String creates multiple objects
    for (int i = 0; i < 10; i++) {
        str = str + " World";
    }
    System.out.println(str);
    
    // Efficient approach with StringBuilder
    StringBuilder sb = new StringBuilder("Hello");
    for (int i = 0; i < 10; i++) {
        sb.append(" World");
    }
    System.out.println(sb.toString());
}
}
