package LoopsAndStatements;
import java.util.Scanner;
//Using If-Else with Ranges (Not Possible with Switch)
public class IfElseRanges {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        if (number >= 1 && number <= 10) {
	            System.out.println("The number is between 1 and 10.");
	        } else if (number > 10 && number <= 20) {
	            System.out.println("The number is between 11 and 20.");
	        } else {
	            System.out.println("The number is out of range.");
	        }
	        sc.close();
	    }

	}

