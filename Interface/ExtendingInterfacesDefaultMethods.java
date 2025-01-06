package Interface;

interface Animal1 {
    default void sound() {
        System.out.println("Animal sound");
    }
}

interface cat extends Animal1 {
    default void sound() {
        System.out.println("Bark");
    }
}

class Bull implements cat {
	
    // Uses the default sound
}

public class ExtendingInterfacesDefaultMethods {
    public static void main(String[] args) {
        Bull bulldog = new Bull();
        bulldog.sound(); 
        
    }
}

