package enumpra;
enum Day1 {
    SUNDAY("Rest day"), MONDAY("Start of the week"), TUESDAY("Busy day"),
    WEDNESDAY("Midweek"), THURSDAY("Almost Friday"), FRIDAY("Almost Weekend"),
    SATURDAY("Weekend");

    private String description;  

    Day1(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class EnumwithFieldsandMethods {
    public static void main(String[] args) {
        for (Day1 day : Day1.values()) {
            System.out.println(day + ": " + day.getDescription());
        }
    }
}

