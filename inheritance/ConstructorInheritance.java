package inheritance;
//Constructors are not inherited, but the subclass constructor can call the parent class constructor using super()

class Employee1 {
    Employee1(String name) {
        System.out.println("Employee name: " + name);
    }
}

class Manager1 extends Employee1 {
    Manager1(String name) {
        super(name); 
        System.out.println("Manager created.");
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        Manager1 manager = new Manager1("John");
    }
}



