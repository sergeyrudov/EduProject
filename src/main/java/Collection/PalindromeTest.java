package Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PalindromeTest {
    public static void main(String[] args) {
        String s = "kazak";
        List<Character> list = new LinkedList<>();

        for (char ch: s.toCharArray()) {
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }


        System.out.println(isStringPalindrome("kazak"));

        String val = "Hello w o r l d";
        System.out.println(Arrays.toString(val.split("\\s+")));

        System.out.println(reverseString("Privet"));
    }




    public static boolean isStringPalindrome(String str) {
        String st = str.toLowerCase();

        int start = 0;
        int end = st.length() - 1;

        while (end > start) {
            if(st.charAt(start) != st.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String reverseString(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }



}
