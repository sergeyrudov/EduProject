package Generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringCOmpar {
    public static void main(String[] args) {
        String[] vals = new String[]{"Sign In", "Locations", "About"};


        String input = "Cheese bread avocado banana";



        boolean b = containsAll(input, true, vals);
        System.out.println(b);


    }


    public static boolean containsAll(String str, boolean ignoreCase, String... parts) {
        if (str == null || parts == null || parts.length == 0) {
            return false;
        }
        if (ignoreCase) {
            str = str.toLowerCase();
        }
        String finalStr = str;
        return Arrays.stream(parts)
                .allMatch(s -> {//allMatch returns true if stream is empty so we cannot use filter()
                    if (s == null || s.length() == 0) {
                        return false;
                    }
                    if (ignoreCase) {s = s.toLowerCase();}
                    return finalStr.contains(s);
                });
    }

}
