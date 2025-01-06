package enumpra;
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class DaysofWeek {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        
        switch (day) {
            case MONDAY:
                System.out.println("Start of the workweek.");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek day.");
        }
    }
}


