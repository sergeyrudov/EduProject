package HashSetExample;

import java.util.HashSet;
import java.util.Set;

public class HashSetExmpl {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("OK");
        set.add("privet");
        set.add("kak dela");
        set.add("da");
        set.add("net");
        set.add(null);
        set.remove(null);

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("OK"));
        System.out.println(set.getClass());

        System.out.println(set);
        for (String s: set
             ) {
            System.out.println(s);
        }
    }
}
