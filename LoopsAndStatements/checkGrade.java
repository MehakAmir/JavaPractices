package LoopsAndStatements;

public class checkGrade {

	public static void main(String[] args) {
		int marks = 85;
		switch (marks / 10) {
		    case 10: case 9: System.out.println("Grade A"); break;
		    case 8: System.out.println("Grade B"); break;
		    case 7: System.out.println("Grade C"); break;
		    case 6: System.out.println("Grade D"); break;
		    default: System.out.println("Grade F");
		    
//		    if (marks >= 90) {
//		        System.out.println("Grade A");
//		    } else if (marks >= 80) {
//		        System.out.println("Grade B");
//		    } else if (marks >= 70) {
//		        System.out.println("Grade C");
//		    } else if (marks >= 60) {
//		        System.out.println("Grade D");
//		    } else {
//		        System.out.println("Grade F");
//		    }

		    
		}
	}

}
