package Collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Double, StudentExample> lhm = new LinkedHashMap<>(16, 0.75f, true);

        StudentExample st1 = new StudentExample("Igor", "Petrov", 3);
        StudentExample st2 = new StudentExample("Mariya", "Ivanova", 1);
        StudentExample st3 = new StudentExample("Petr", "Sidorov", 4);
        StudentExample st4 = new StudentExample("Vasiliy", "Pupkov", 3);

        lhm.put(5.6, st1);
        lhm.put(6.4, st2);
        lhm.put(7.2, st3);
        lhm.put(7.5, st4);

       // System.out.println(lhm);
    }
}

