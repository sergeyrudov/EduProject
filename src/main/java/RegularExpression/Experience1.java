package RegularExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Experience1<T> {

    ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,5));


    public void set(List<T> value, int destination, T index) {
        value.set(destination, index);
    }


    public static <T> T getValByIndex(List<T> value, int index) {
        return value.get(index);
    }

    public static void main(String[] args) {
        /*Experience1<Integer> ex1 = new Experience1<Integer>();

        System.out.println(ex1.integerList);
        ex1.set(ex1.integerList, 1, 100);
        System.out.println(ex1.integerList);
*/


        String var = "T20 CLASSIC CHECKING S:0020 $0.00";
        System.out.println(Arrays.toString(getData(var)));




        /*String text = "T20 CLASSIC CHECKING S:0020 $0.00";

        Pattern pattern = Pattern.compile("\\$\\d+.+");


        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }*/
    }

    public static String[] getData(String v) {
        String[] amount = v.split("(\\w+\\d+.\\w+.\\w+.\\w+:\\d+)");
        return amount;
    }

}


