package LoopsAndStatements;
import java.util.Scanner;

//even odd using switch 

public class evenOdd {
public static void main(String [] args) {

	Scanner a = new Scanner(System.in);
	System.out.println("please enter the number?");
	int n=a.nextInt();
	switch(n%2) {
	
	case 0:
		System.out.println("number is even");
		break;
		default:
		System.out.println("number is odd");
		 a.close();
	}
}
}

//even odd with if else 
//if (number % 2 == 0) {
//    System.out.println(number + " is even.");
//} else {
//    System.out.println(number + " is odd.");
//}
