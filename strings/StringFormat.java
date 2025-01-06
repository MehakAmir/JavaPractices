package strings;

public class StringFormat {

	public static void main(String[] args) {
		float f1 = 3.5678f;
        int i= 4;
        String s ="java programmer";
        //using print f
        System.out.printf("The value of the float variable is %f, while the value of the integer variable is %d, and the string is %s\n",f1, i, s);
        //format string 
        String fS = String.format("The value of the float variable is %f, while the value of the integer variable is %d, and the string is %s", f1, i, s);
        System.out.println(fS);
	}
}
