package strings;

public class StringReverse {
	public static void main(String[] args) {
        String st = "i love java programming";
        int len = st.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // Put original string in an array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = st.charAt(i);
        }
        
        // Reverse array
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }
        
        String reversest = new String(charArray);
        System.out.println("Reversed string is : " + reversest);
    }
}
