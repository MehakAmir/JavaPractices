package lambdaExpression;
import java.util.*;


public class LambdaComparatorExample {
	public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Banana", "Grape");

        // Sorting the list using lambda expression
        Collections.sort(fruits, (a, b) -> a.compareTo(b));
        fruits.forEach(System.out::println);
    }
}
