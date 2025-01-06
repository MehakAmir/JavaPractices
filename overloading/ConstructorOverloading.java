package overloading;
class Car {
    String model;
    int year;
    
    // Constructor with no parameters
    public Car() {
        this.model = "Unknown";
        this.year = 2020;
    }
    
    // Constructor with one parameter
    public Car(String model) {
        this.model = model;
        this.year = 2020;
    }
    
    // Constructor with two parameters
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    
    public void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Car car1 = new Car();        
        Car car2 = new Car("Tesla");   
        Car car3 = new Car("BMW", 2022); 
        
        car1.display();
        car2.display();
        car3.display();
    }
}
