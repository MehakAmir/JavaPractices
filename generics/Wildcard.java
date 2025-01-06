package generics;

import java.util.Arrays;
import java.util.List;

public class Wildcard {
	
	    public static void printList(List<?> list) {
	        for (Object obj : list) {
	            System.out.println(obj);
	        }
	    }

	    public static void main(String[] args) {
	        List<String> stringList = Arrays.asList("apple", "banana", "cherry");
	        List<Integer> intList = Arrays.asList(1, 2, 3);

	        
	        printList(stringList);
	        printList(intList);
	    }
	}

