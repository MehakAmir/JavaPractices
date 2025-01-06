package strings;

public class StringImmutable {

	public static void main(String[] args) {
		String str1 = "Hello";
        String str2 = str1;

        str1 = str1 + " World";

        System.out.println("str1: " + str1); // Prints "Hello World"
        System.out.println("str2: " + str2); // Prints "Hello"
	}

}
