package inheritance;
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager is managing a team.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.work();  
        manager.manage();
    }
}

