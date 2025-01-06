package strings;

public class StringBuilderExample {
	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming"); // Modifies the original object
       
        System.out.println("StringBuilder: " + sb); 
    }
}
