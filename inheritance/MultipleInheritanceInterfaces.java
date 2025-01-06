package inheritance;
interface Vehicle {
    void drive();
}

interface Engine {
    void start();
}

class Car implements Vehicle, Engine {
    public void drive() {
        System.out.println("Car is driving.");
    }

    public void start() {
        System.out.println("Car engine started.");
    }
}

public class MultipleInheritanceInterfaces {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();   
        car.start();   
    }
}


