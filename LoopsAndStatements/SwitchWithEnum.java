package LoopsAndStatements;


enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
public class SwitchWithEnum {

	public static void main(String[] args) {
		Day today= Day.MONDAY;
		switch(today){
		case MONDAY:
            System.out.println("Start of the week!");
            break;
        case FRIDAY:
            System.out.println("Almost the weekend!");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekend!");
            break;
        default:
            System.out.println("Mid-week!");
		}
	}

}
