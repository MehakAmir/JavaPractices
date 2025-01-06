package generics;
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
 @Override
 public void sound() {
     System.out.println("Cat meows");
 }
}

class Dog extends Animal {
 @Override
 public void sound() {
     System.out.println("Dog barks");
 }
}



//Generic class with bounded type parameter
class AnimalShelter<T extends Animal> {
 private T animal;

 public void addAnimal(T animal) {
     this.animal = animal;
 }

 public void makeAnimalSound() {
     animal.sound();
 }
}



public class BoundedTypeParameter {
    public static void main(String[] args) {
   
        AnimalShelter<Cat> catShelter = new AnimalShelter<>();
        Cat cat = new Cat();
        catShelter.addAnimal(cat);
        catShelter.makeAnimalSound();  

       
        AnimalShelter<Dog> dogShelter = new AnimalShelter<>();
        Dog dog = new Dog();
        dogShelter.addAnimal(dog);
        dogShelter.makeAnimalSound(); 
    }
}




