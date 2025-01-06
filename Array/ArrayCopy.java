package Array;

public class ArrayCopy {

	public static void main(String[] args) {
		//System.arraycopy
		String[] copyFrom = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        String[] copyTo = new String[3];

        System.arraycopy(copyFrom, 1, copyTo, 0, 3);

        for (String fruit : copyTo) {
            System.out.print(fruit + " ");
        }
	}

}
