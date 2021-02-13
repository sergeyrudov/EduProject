package enumTest;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.MONDAY);
        Today today1 = new Today(WeekDays.SUNDAY);
        WeekDays w = WeekDays.FRIDAY;
        System.out.println(today.weekDays);

        today.daysInfo();
        today1.daysInfo();


        System.out.println(WeekDays.SATURDAY == WeekDays.SATURDAY);

        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays [] array = WeekDays.values();
        System.out.println(Arrays.toString(array));
    }
}


enum WeekDays{
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private final String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String toString() {
        return mood;
    }
}

class Today {
    WeekDays weekDays;

    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to Work");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Vacation day");
                break;
        }
        System.out.println("Nastroenie v etot den:" + weekDays.toString());
    }
}
