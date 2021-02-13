package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAllExample {
    public static void main(String[] args) {
        String myString =
                "12345678903847561029129;" +
                "22534674567983450430328;" +
                "32452346278345620328029;" +
                "89374577109867560527229";
                // 01 / 29 1234 5678 9038 4756 -> 432 CVV

        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");

        Matcher matcher = pattern.matcher(myString);
        /*String myNewString  = matcher.replaceAll("(MM:$5/ YY:$6) $1-$2-$3-$4 (CVV:$7)");
        System.out.println(myNewString);*/

        while (matcher.find()) {
            System.out.println(matcher.group(7));
        }
    }
}
