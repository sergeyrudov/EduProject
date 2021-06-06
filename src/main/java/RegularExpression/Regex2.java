package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        /*String s1 = "ABCD ABCE ABCF ABCFGHABCG";
        Pattern pattern = Pattern.compile("ABC");*/

        /*String s1 = "ABDOP";
        Pattern pattern = Pattern.compile("AB[C-F]OP");*/

        //String s1 = "abcd abce abc5abcg6abch";
        // [^] - symbol of range negation, "not in range"

        //Pattern pattern = Pattern.compile("abc[^e-g4-7]");

        /*String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern = Pattern.compile("abc(e|5)");*/

        // . - any symbol, except new row - > \n
        /*String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern = Pattern.compile("abc.");*/


        // ^ exact match for the desired pattern, for first match
        /*String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern = Pattern.compile("^abc");*/


        // $ - end of string
        /*String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern = Pattern.compile("ch$");*/

        /*String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern = Pattern.compile("[0-9]");*/
        //System.out.println("Hello \" world");
        //System.out.println("Hello \\ world");



        // \\d  - metasymbol, one digit from 0 to 9
        /*String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern = Pattern.compile("\\d");*/

        // \\D exclude digits
        /*String s1 = "abcd abce abc544abcg6abch";
        Pattern pattern = Pattern.compile("\\D");*/


        // \\w exclude space
        /*String s1 = "abcd abce abc544abcg6abch";
        Pattern pattern = Pattern.compile("\\w"); // the same as [A-Za-z0-9_]*/

        // one or more repeating
        /*String s1 = "abcd abce abc544abcg6abch";
        Pattern pattern = Pattern.compile("\\w+");*/


        /*String s1 = "abcd!?abce======abc ++544abcg6abch";
        Pattern pattern = Pattern.compile("\\W+");*/

        /*String s1 = "poka abc Petr dom kino da naprimer ABCBABDA";
        Pattern pattern = Pattern.compile("\\w{3,4}");*/

        /*String s1 = "ABCABABDA";
        Pattern pattern = Pattern.compile("(AB){2,3}");*/

        /*String s1 = "DABCDABABDABABABABABABD";
        Pattern pattern = Pattern.compile("D(AB){2,}");*/

        /*String s1 = "DABCDABABDA";
        Pattern pattern = Pattern.compile("D(AB)?");*/

        /*String s1 = "abcd abce abc544abcg6abch";
        Pattern pattern = Pattern.compile("\\Aabcd");*/

        /*String s1 = "abcd abce abc544abcg6abch";
        Pattern pattern = Pattern.compile("bch\\Z");*/

        /*String s1 = "abcd abce abc544abcg6abch";
        Pattern pattern = Pattern.compile("[abcd][efgh3-8]");*/


        String s1 = "T20 CLASSIC CHECKING S:0020 $0. *S:0020 T20 CLASSIC CHECKING";
        Pattern pattern = Pattern.compile("\\$\\d+.");


        Matcher matcher = pattern.matcher(s1);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }


        String[] names = {"name1", "name2"};

        System.out.println(names[0]);
    }
}
