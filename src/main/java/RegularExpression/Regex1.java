package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s
                = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 511, Flat 48," +
                "email: vivanov@gmail.com, Postcode: AA99, Phone Number: +1234567896;"
                + "Petrova Mariya, Ukraine, Kiev, Lomonosov street, 33, Flat 18," +
                "email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;"
                + "Chuck Norris, USA, Hollywood, All stars street, 8744, Flat 21," +
                "email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        //Pattern pattern = Pattern.compile("\\w+");

        //Pattern pattern = Pattern.compile("\\b\\d{2}\\b");

        //Pattern pattern = Pattern.compile("\\+\\d{9}");

        //Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com|ua)");

        //Pattern pattern = Pattern.compile("\\w\\s+\\w");

        // Pattern pattern = Pattern.compile("\\w\\S+\\w");

        // Pattern pattern = Pattern.compile("\\+\\d{9,10}"); // phone search

         Pattern pattern = Pattern.compile("\\b\\d{1,4}\\b"); // flat search








        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
