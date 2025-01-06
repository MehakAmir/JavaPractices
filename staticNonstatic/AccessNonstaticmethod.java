package staticNonstatic;

class Name {
    
    String name;

    
    Name(String name) {
        this.name = name;
    }

    
    void greet() {
        System.out.println("Hello, " + name);
    }

    
    static void staticMethod() {
      
    	Name person = new Name("MEHAK");

        
        person.greet(); 
    }
}

public class AccessNonstaticmethod {
    public static void main(String[] args) {
    	Name.staticMethod();
    }
}

