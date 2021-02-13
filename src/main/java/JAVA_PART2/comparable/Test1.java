package JAVA_PART2.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Petr");
        list.add("Zafira");
        list.add("Anya");
        System.out.println("Pered sortirovkoy");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("Posle sortirovki");
        System.out.println(list);
    }
}
