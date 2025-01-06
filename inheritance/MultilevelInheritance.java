package inheritance;
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Puppy extends Dog {
    void sleep() {
        System.out.println("The puppy sleeps.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   
        puppy.bark();  
        puppy.sleep(); 
    }
}
