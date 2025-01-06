package staticc;

public class StaticInitializer {

  
    static int staticVariable;

    static {
        System.out.println("Static initializer block is executed.");
        staticVariable = 100;
    }

    public static void display()
    {
        System.out.println("Value of staticVariable: " + staticVariable);
    }

    public static void main(String[] args) 
    {
        StaticInitializer.display();
    }
}

