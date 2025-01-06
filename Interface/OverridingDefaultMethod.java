package Interface;


interface MyInterface {
    // Default method
    default void greet() {
        System.out.println("Hello from default method!");
    }

    // Abstract method
    void printMessage(String message);
}

class MyClass implements MyInterface {
    // Overriding
    public void greet() {
        System.out.println("Hello from overridden method!");
    }
    public void printMessage(String message) {
        System.out.println(message);
    }
}

public class OverridingDefaultMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.greet();  
        obj.printMessage("This is an abstract method implementation.");  
    }
}

