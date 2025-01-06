package Interface;

interface Animal {
    void sound();
    
    
    default void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof! Woof!");
    }
}

class DefaultMethod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();   
        dog.sleep();   
        Printer printer = new LaserPrinter();
        printer.print();
    }
}


interface Printer {
    default void print() {
        System.out.println("Printing...");
    }
}

class LaserPrinter implements Printer {
    // No need to override 
}

