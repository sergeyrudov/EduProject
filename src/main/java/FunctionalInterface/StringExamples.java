package FunctionalInterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringExamples {
    public static void main(String[] args) {
        // String example
        String immutableString = "   Hello, how are you?  ";

       // checkThatStringImmutable(immutableString);
        //checkThatStringBuilderMutable(immutableString);
        String st = "Learn smth new";

        char symbols[] = st.toCharArray();
        for(int x= symbols.length-1; x>=0; x--) {

            System.out.print(symbols [x]);

        }


    }

    static void checkThatStringImmutable(String value) {
        // not effective, garbage is collected
        value = value.toUpperCase();
        value = value.trim();
        System.out.println(value);
    }

    static void checkThatStringBuilderMutable(String value) {
        StringBuilder stringBuilder = new StringBuilder(value);
        stringBuilder.append(" -> I AM FINE");
        stringBuilder.trimToSize();
        stringBuilder.append(Arrays.toString(new String[]{"Good to know it!"}));
        System.out.println(stringBuilder);
        Map<Integer, String> map = new HashMap<>();
        map.put(111, "Hello");
    }

    static void checkStringBuffer(String value) {
        StringBuffer stringBuffer = new StringBuffer(value);
        String literal = "dff";

    }
}
