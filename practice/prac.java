package practice;

class pen{
	String color;
	String type;
	
	public void write(){
		System.out.println("print something");
	}
	
	//make parameter constructor
	pen(String color, String type){
		this.color=color;
		this.type=type;
	}
	
	
	void displayInfo() {
        System.out.println("pen color: " + color);
        System.out.println("pen type: " + type);
    }
}

public class prac {

	public static void main(String[] args) {
		pen p1 = new pen("blue","gelpen");
		p1.displayInfo();

		
	//method access
		p1.write();

	}

}
