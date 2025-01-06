package lambdaExpression;

import java.util.*;

public class LambdaForEachExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

        // Using lambda expression 
        names.forEach(name -> System.out.println(name));
    }
}