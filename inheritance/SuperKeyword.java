package inheritance;
class Employee2 {
    void work() {
        System.out.println("Employee is working.");
    }
}

class Manager2 extends Employee2 {
    @Override
    void work() {
        super.work();  
        System.out.println("Manager is managing the team.");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Manager2 manager = new Manager2();
        manager.work();  
    }
}


