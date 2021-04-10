package RegularExpression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterStringWithUSD {

    static String s = "T20 CLASSIC CHECKING XX866 - S:0020 - Checking.   $0.44.";


    public static void main(String[] args) {

        System.out.println(getName());
        System.out.println(getValue());

    }

    public static String[] accountValues() {
        String a = null;
        String b = null;

        Pattern findUSD = Pattern.compile("(.*?)\\s+(\\$[0-9]*\\.*[0-9]+.)");
        Matcher USD = findUSD.matcher(s);

        while (USD.find() ) {
            a = USD.group(1);
            b = USD.group(2);
        }
        return new String[]{a, b};
    }

    public static String getName() {
        return accountValues()[0];
    }
    public static String getValue() {
        return accountValues()[1];
    }


}
