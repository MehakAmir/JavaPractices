package inheritance;

class Paren {
 int number = 50;
}


class Chil extends Paren {
 int number = 100;  
 
 void show() {
   
     System.out.println("Child's number: " + number);  
     
     
     System.out.println("Parent's number using super: " + super.number);  
 }
}

public class AccessHiddenFieldUsingsuper {
 public static void main(String[] args) {
     Chil child = new Chil();
     child.show();
 }
}


