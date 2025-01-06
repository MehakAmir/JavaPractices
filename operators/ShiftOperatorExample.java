package operators;

public class ShiftOperatorExample {

	public static void main(String[] args) {
int a = 20;  
        // Left shift (Multiplying by 2^2)
        int leftShift = a << 3;  
        System.out.println("a << 3 = " + leftShift);  
        
        // Right shift (Dividing by 2^2)
        int rightShift = a >> 2;  
        System.out.println("a >> 2 = " + rightShift); 
        
        // Unsigned right shift (for negative number)
        int unsignedRightShift = -20 >>> 2;  
        System.out.println("-20 >>> 2 = " + unsignedRightShift); 
	}

}
