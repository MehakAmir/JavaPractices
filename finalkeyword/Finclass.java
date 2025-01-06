package finalkeyword;


//Final class
final class FinalClass {
public void show() {
   System.out.println("This is a final class.");
}
}

//class SubClass extends FinalClass { // Error: cannot subclass the final class 'FinalClass'
//public void show() {
//    System.out.println("Trying to extend final class.");
//}
//}

public class Finclass {
public static void main(String[] args) {
   FinalClass obj = new FinalClass();
   obj.show();  
}
}

