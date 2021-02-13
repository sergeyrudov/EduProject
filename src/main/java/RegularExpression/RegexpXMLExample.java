package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpXMLExample {
    public static void main(String[] args) {

        String mainMenu = "<srvCheckSomeValue>Y</srvCheckSomeValue>" +
                "<androidVersion>0.99</androidVersion>" +
                "<DATAPROVIDER>WM</DATAPROVIDER>" +
                "<OUTER_TAG><INNER_TAG>SOME_VALUE</INNER_TAG></OUTER_TAG>" +


                "<outer>inner<>" +
                "<TST>Н</TST>" +
                "<>PROVIDER" +
                "<PROVIDER>TEST</PROVIDER>" +
                "<DATA>MW_DATA</DATA>" +
                "<DATA><INNER_DATA>TEST</>" +
                "<DATA><>INNER data" +
                "DATA" +
                "<DATA_1><INNER_BLOCK>SOMEDATA123+</INNER_BLOCK>" +
                "<DATA_1><INNER_BLOCK>SOMEDATA123+<INNER_BLOCK>";

        Pattern pattern = Pattern.compile("<[^ \\/>]++ ?\\/>|<([^ \\>]++) ?[^>]*+>[a-zA-Z0-9._+\\<\\/>]*?<\\/ ?\\1>");
        Matcher matcher = pattern.matcher(mainMenu);

        while (matcher.find()) {
            System.out.println(matcher.group().toUpperCase());
        }
    }
}
