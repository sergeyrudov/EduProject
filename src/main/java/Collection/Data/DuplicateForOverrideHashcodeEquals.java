package Collection.Data;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@AllArgsConstructor
@ToString
class Auto {
    int price;
    String color;
    String name;
}

public class DuplicateForOverrideHashcodeEquals {
    public static void main(String[] args) {

        Auto a1 = new Auto(100, "Black", "BMW");
        Auto a2 = new Auto(200, "Red", "Audi");
        Auto a3 = new Auto(100, "Black", "BMW");



        HashSet<Auto> set = new HashSet<>();
        Map<Auto, String> map = new HashMap<>();

        set.add(a1);
        set.add(a2);
        set.add(a3);

        map.put(a1, "1");
        map.put(a2, "2");
        map.put(a3, "3");


        System.out.println(set);
        System.out.println(map);

    }
}
