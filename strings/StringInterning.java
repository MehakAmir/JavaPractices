package strings;

public class StringInterning {
	public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        // Both references point to the same object in the string pool
        System.out.println(str1 == str2); 

        String str3 = new String("Hello");
        System.out.println(str1 == str3); //  false
    }
}
