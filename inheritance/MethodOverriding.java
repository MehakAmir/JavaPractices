package inheritance;
class Vehicle1 {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car1 extends Vehicle1 {
    @Override
    void start() {
        System.out.println("Car is starting.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle1 vehicle = new Car1();
        vehicle.start();  
    }
}

