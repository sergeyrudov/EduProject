package RegularExpression;

import java.util.regex.Pattern;

public class VerifyIPAddress {
    public static void main(String[] args) {
        // 0-255.0-255.0-255.0-255
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";

        checkIP(ip1);
        checkIP(ip2);

    }

    static void checkIP(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.))" +
                "{3}(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }
}
