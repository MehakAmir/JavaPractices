package practice;

class Car {
    String color;
    String model;

    // Constructor
    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // Method to display car info
    void displayInfo() {
        System.out.println("Car model: " + model);
        System.out.println("Car color: " + color);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Passing arguments to the constructor
        Car myCar = new Car("Red", "Tesla");
        myCar.displayInfo();  // Calling the method to display car info
    }
}

