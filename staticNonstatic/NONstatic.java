package staticNonstatic;

class Person {
   
    String name;

   
    Person(String name) {
        this.name = name;
    }

    
    void greet() {
        System.out.println("Hello, " + name);
    }

    // Static method (can access static variables)
    static void staticMethod() {
        System.out.println("This is a static method");
    }
}

public class NONstatic {
    public static void main(String[] args) {
        
        Person person1 = new Person("Mehak");
        Person person2 = new Person("sara");

        person1.greet();  
        person2.greet();  

        Person.staticMethod();  
    }
}

