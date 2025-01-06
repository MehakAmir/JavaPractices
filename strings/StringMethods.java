package strings;

public class StringMethods {
	public static void main(String[] args) {
//toUpperCase() , substring(), replace(),charAt()
String str = "hello";
        
        String upperStr = str.toUpperCase(); 
        String substringStr = str.substring(1, 4);
        String replacedStr = str.replace('e', 'a'); 
        char c = str.charAt(2);
        
        System.out.println("Original String: " + str); 
        System.out.println("Uppercase String: " + upperStr); 
        System.out.println("Substring: " + substringStr); 
        System.out.println("Replaced String: " + replacedStr);
        System.out.println("character is : " + c);
}
}
