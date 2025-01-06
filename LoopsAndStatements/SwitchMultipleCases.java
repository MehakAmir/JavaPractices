package LoopsAndStatements;
//Switch with Multiple Values for the Same Outcome
public class SwitchMultipleCases {

	public static void main(String[] args) {
int number = 6;
        
        switch (number) {
            case 1:
            case 2:
            case 3:
                System.out.println("Low number");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Medium number");
                break;
            default:
                System.out.println("High number");
        }
    }

	}

