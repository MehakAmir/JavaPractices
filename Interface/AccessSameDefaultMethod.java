package Interface;
interface Interface1 {
    default void greet() {
        System.out.println("Hello from Interface1");
    }
}

interface Interface2 {
    default void greet() {
        System.out.println("Hello from Interface2");
    }
}

class My implements Interface1, Interface2 {
    public void greet() {
        Interface1.super.greet(); 
        Interface2.super.greet();  
    }
}

public class AccessSameDefaultMethod {
    public static void main(String[] args) {
        My obj = new My();
        obj.greet();  
    }
}

