package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		
        int a = 60;  
        int b = 13; 

        // AND operator
        int resultAnd = a & b;
        System.out.println(a + " & " + b + " = " + resultAnd + " (Binary: " + Integer.toBinaryString(resultAnd) + ")");

        // OR operator
        int resultOr = a | b;
        System.out.println(a + " | " + b + " = " + resultOr + " (Binary: " + Integer.toBinaryString(resultOr) + ")");

        // XOR operator
        int resultXor = a ^ b;
        System.out.println(a + " ^ " + b + " = " + resultXor + " (Binary: " + Integer.toBinaryString(resultXor) + ")");

        // NOT operator
        int resultNotA = ~a;
        int resultNotB = ~b;
        System.out.println("~" + a + " = " + resultNotA + " (Binary: " + Integer.toBinaryString(resultNotA) + ")");
        System.out.println("~" + b + " = " + resultNotB + " (Binary: " + Integer.toBinaryString(resultNotB) + ")");

        // Left Shift operator (<<)
        int resultLeftShiftA = a << 2; 
        int resultLeftShiftB = b << 2;
        System.out.println(a + " << 2 = " + resultLeftShiftA + " (Binary: " + Integer.toBinaryString(resultLeftShiftA) + ")");
        System.out.println(b + " << 2 = " + resultLeftShiftB + " (Binary: " + Integer.toBinaryString(resultLeftShiftB) + ")");

        // Right Shift operator (>>)
        int resultRightShiftA = a >> 2;  
        int resultRightShiftB = b >> 2;
        System.out.println(a + " >> 2 = " + resultRightShiftA + " (Binary: " + Integer.toBinaryString(resultRightShiftA) + ")");
        System.out.println(b + " >> 2 = " + resultRightShiftB + " (Binary: " + Integer.toBinaryString(resultRightShiftB) + ")");
    }

}
