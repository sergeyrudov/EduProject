package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Igor");
        map1.put(2222, "Ivan");
        map1.put(3444, "Mariya");
        map1.put(3445, "Nikolay");
        map1.put(1000, "vasiliy");
        map1.put(null, "Kseniya");

        map1.putIfAbsent(2222, "Ivan 1");
        map1.remove(3444);

       // System.out.println(map1.containsKey(null));
        //System.out.println(map1.containsValue("Ignat"));

        System.out.println(map1.keySet());
        System.out.println(map1.values());

        //System.out.println(map1);
        //System.out.println(map1.get(null));

        Map<String, String> map2 = new HashMap<>();
        map2.put("Sasha", "Good");
        map2.put("Book", "Red");
        map2.put("Pogoda", "bad");
    }
}
