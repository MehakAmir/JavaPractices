package inheritance;

class Parent11 {
 int number = 10;  
}

class Child11 extends Parent11 {
 int number = 20; 
}

public class FieldHidinginInheritance {
 public static void main(String[] args) {
     Parent11 parent = new Parent11();
     Child11 child = new Child11();
     
     System.out.println("Parent's number: " + parent.number);  
     System.out.println("Child's number: " + child.number);    
     
     // Using Parent reference to refer to a Child object
     Parent11 parentRef = new Child11();
     System.out.println("Parent reference pointing to Child object's number: " + parentRef.number);
 }
}


