package LoopsAndStatements;

public class nestedSwitchCondition {

	public static void main(String[] args) {
		//Check if a number is between 1 and 100 and whether it’s even or odd
//		switch (numb) {
//		    case in n if n > 0 && n <= 100: not possible using switch use if else there 
		int num = 42;
		if (num > 0 && num <= 100) {
		    if (num % 2 == 0) {
		        System.out.println("Even and between 1 and 100");
		    } else {
		        System.out.println("Odd and between 1 and 100");
		    }
		} else {
		    System.out.println("Out of range");
		}

	
	}
	}

