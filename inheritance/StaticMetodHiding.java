package inheritance;
class Parent {
    static void show() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child static method");
    }
}

public class StaticMetodHiding {
    public static void main(String[] args) {
        Parent.show();  
        Child.show();   
    }
}

//static method linked with the class not object 
//A final method cannot be overridden in a subclass