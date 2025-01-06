package generics;



public class Printer <T>{
	T thingToPrint;
	public Printer( T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		System.out.println(thingToPrint);
	}
public static void main(String[] args) {
	Printer<Double> printer = new Printer<Double>(10.5);
	printer.print();
	Printer<Integer> printer1 = new Printer<Integer>(10);
	printer1.print();
	
	Printer<Float> printer3 = new Printer<Float>(10.5F);
	printer3.print();

	
}
	

}

