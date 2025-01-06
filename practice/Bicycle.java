package practice;

public class Bicycle {

    // Fields 
    public int cadence;
    public int gear;
    public int speed;

    // Constructor to initialize the Bicycle object
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;        
        cadence = startCadence;    
        speed = startSpeed;        
    }

    // Method to set the cadence of the bicycle
    public void setCadence(int newValue) {
        cadence = newValue;  
    }

    // Method to set the gear of the bicycle
    public void setGear(int newValue) {
        gear = newValue;   
    }

    // Method to apply the brake and reduce the speed
    public void applyBrake(int decrement) {
        speed -= decrement;  
    }

    // Method to speed up the bicycle
    public void speedUp(int increment) {
        speed += increment;  
    }

    public static void main(String[] args) {
        Bicycle myBike = new Bicycle(50, 10, 3); 
        
        // Display initial values
        System.out.println("Initial Bicycle State:");
        System.out.println("Cadence: " + myBike.cadence);
        System.out.println("Speed: " + myBike.speed);
        System.out.println("Gear: " + myBike.gear);

        // Use the methods to modify the bicycle's state
        myBike.setCadence(75);   
        myBike.setGear(5);       
        myBike.speedUp(10);      
        myBike.applyBrake(5);    
        
        // Display modified values
        System.out.println("\nModified Bicycle State:");
        System.out.println("Cadence: " + myBike.cadence);
        System.out.println("Speed: " + myBike.speed);
        System.out.println("Gear: " + myBike.gear);
    }
}







//another example 


//class Car {
//    String color;
//    String model;
//
//    // Constructor
//    Car(String color, String model) {
//        this.color = color;
//        this.model = model;
//    }
//
//    // Method to update the car's color
//    void updateColor(String newColor) {
//        color = newColor;
//    }
//
//    // Method to display car info
//    void displayInfo() {
//        System.out.println("Car model: " + model);
//        System.out.println("Car color: " + color);
//    }
//}
//
//public class classes {
//    public static void main(String[] args) {
//        // Create a car object
//        Car myCar = new Car("Red", "Tesla");
//
//        // Display initial car info
//        myCar.displayInfo();
//
//        // Passing argument to method to change car color
//        myCar.updateColor("Blue");
//
//        // Display updated car info
//        myCar.displayInfo();
//    }
//}
//
//
