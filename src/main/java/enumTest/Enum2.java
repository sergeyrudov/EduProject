package enumTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Enum2 {
    public static void main(String[] args) {
        System.out.println(WeekDays2.FRIDAY.equals(WeekDays.FRIDAY));

        String[] array = {"hello", "world", "java!"};
        List<String> ars= new ArrayList<>(Arrays.asList(array));
        System.out.println(ars.get(1));
    }
}



enum WeekDays2{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}
