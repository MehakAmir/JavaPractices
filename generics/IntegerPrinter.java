package generics;


public class IntegerPrinter {
	Integer thingToPrint;
	public IntegerPrinter(Integer thingToPrint) {
		this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		System.out.println(thingToPrint);
	}
public static void main(String[] args) {
	IntegerPrinter printer = new IntegerPrinter(10);
	printer.print();
}

}


