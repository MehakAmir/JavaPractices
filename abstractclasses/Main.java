package abstractclasses;
abstract class Animal {
   
    abstract void makeSound();

    
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Main {
    public static void main(String[] args) {
        // Animal a = new Animal(); // Error Cannot instantiate 
        Animal dog = new Dog();
        dog.makeSound();  
        dog.sleep();      
    }
}


