package abstractclasses;

abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("The vehicle is stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("The car is started.");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("The bike is started.");
    }
}

class AbstractClassSubclasse {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();  
        myCar.stop();    

        Vehicle myBike = new Bike();
        myBike.start();  
        myBike.stop();    
    }
}


