package finalkeyword;

class ParentClass {
    // Final method
    public final void displayMessage() {
        System.out.println("This is a final method.");
    }
}

class ChildClass extends ParentClass {
 
    // public void displayMessage() { // Error: cannot override the final method from ParentClass
    //     System.out.println("Message from child.");
    // }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.displayMessage(); 
    }
}

