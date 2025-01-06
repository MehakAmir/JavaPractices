package strings;

public class StringComparison {
	public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2); // same reference
        System.out.println(str1.equals(str3)); // same value
        System.out.println(str1 == str3); //different reference
    }
}
