package RegularExpression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class searchAccount {
    static String s = "T20 CLASSIC LOAN XX866 - S:0020 - Checking";
    static String s1 = "T21 CLASSIC CHECKING S:0020 $0";
    static String s2 = "T20 CLASSIC CHECKING XX866 - S:0020 - Checking $0.00";
    static String s3 = "Call 15105426815";
    static String s4 = ", 510 542 6815,";


    public static void main(String[] args) {

        System.out.println(getName());
        System.out.println(getValue());
        //System.out.println(phone());
        System.out.println(Long.valueOf(phone()));


    }

    public static String[] accountValues() {
        String firstVal = null;
        String secondVal = null;

        Pattern findUSD = Pattern.compile("(.+?)(\\s((XX[\\d])+|([A-Z]:[\\d])+|([0-9])+).*)");
       /* Matcher sRes = findUSD.matcher(s);
        Matcher s1Res = findUSD.matcher(s1);*/
        Matcher s2Res = findUSD.matcher(s2);


        while (s2Res.find() ) {
            firstVal = s2Res.group(1);
        }
        return new String[]{firstVal, secondVal};
    }

    public static String getName() {
        return accountValues()[0];
    }
    public static String getValue() { return accountValues()[1];
    }

    public static String phone() {
        String firstVal = null;

        Pattern finPhone = Pattern.compile("[^A-Z-a-z]+");

        Matcher phone = finPhone.matcher(s3);

        while (phone.find()) {
            firstVal = phone.group().trim();
        }

        return firstVal;
    }
}



