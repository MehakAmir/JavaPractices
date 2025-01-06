package lambdaExpression;

interface MyFunctionalInterface {
 void printMessage(String message);
}

public class LambdaExample {
 public static void main(String[] args) {
     
     MyFunctionalInterface myFunc = (message) -> System.out.println(message);
     

     myFunc.printMessage("this is a lambda expression!");
 }
}

