package casting;
class Animal1 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Downcasting {
    public static void main(String[] args) {
    	Animal a=new Animal();
    	a.sound();
    	Animal1 animal = new Dog1();  // Upcasting happens here
        
        Dog1 dog = (Dog1) animal;  // Explicit downcasting
        
        dog.sound();  
    }
}



//Animal animal = new Animal();
//Dog dog = (Dog) animal;  // This will throw ClassCastException at runtime
////save downcasting
//Animal animal = new Dog();  // Upcasting
//
//if (animal instanceof Dog) {
//    Dog dog = (Dog) animal;  // Safe downcasting
//    dog.sound();
//} else {
//    System.out.println("The animal is not a Dog");
//}



