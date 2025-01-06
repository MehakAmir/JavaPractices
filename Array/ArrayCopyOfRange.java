package Array;

public class ArrayCopyOfRange {

	public static void main(String[] args) {
		
		 String[] copyFrom = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
	        
	        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 1, 4);
	        System.out.println(java.util.Arrays.toString(copyTo));
	    }
	}

