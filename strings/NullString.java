package strings;

public class NullString {
	public static void main(String[] args) {
        String str = null;
        
        try {
            System.out.println(str);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e);
        }
     // class MyString extends String {}  // Error: Cannot subclass final class String
    }
}
