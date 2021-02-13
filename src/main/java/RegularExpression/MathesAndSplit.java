package RegularExpression;

import java.util.Arrays;

public class MathesAndSplit {
    public static void main(String[] args) {
        String s
                = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 511, Flat 48," +
                "email: vivanov@gmail.com, Postcode: AA99, Phone Number: +1234567896;"
                + "Petrova Mariya, Ukraine, Kiev, Lomonosov street, 33, Flat 18," +
                "email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;"
                + "Chuck Norris, USA, Hollywood, All stars street, 8744, Flat 21," +
                "email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        String s2 = "chuck@gmail.com";

        boolean result = s2.matches("\\w+@\\w+\\.(com|ru|ua)");
        System.out.println(result);

        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));
    }
}
