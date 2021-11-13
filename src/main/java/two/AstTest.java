package two;

import java.util.Collection;
import java.util.Scanner;

public class AstTest {

    public static void main(String[] args) {
        // start to check palindrom
        // spaces are not affect string check

        String palindromValue = "anna";
        System.out.println("Value of tested string is:" + palindromValue + "Expected result: true" + "Actual result: is " + isPalindrome(palindromValue));

        palindromValue = "  anna";
        System.out.println("Value of tested string is:" + palindromValue + "Expected result: true" + "Actual result: is " + isPalindrome(palindromValue));

        palindromValue = "  ANNa";
        System.out.println("Value of tested string is:" + palindromValue + "Expected result: true" + "Actual result: is " + isPalindrome(palindromValue));

        palindromValue = "1221";
        System.out.println("Value of tested string is:" + palindromValue + " Expected result: true" + "Actual result: is " + isPalindrome(palindromValue));

        palindromValue = "";
        System.out.println("Value of tested string is:" + palindromValue + " Expected result: true" + "Actual result: is " + isPalindrome(palindromValue));

        palindromValue = "K";
        System.out.println("Value of tested string is:" + palindromValue + " Expected result: true" + "Actual result: is " + isPalindrome(palindromValue));

        palindromValue = null;
        System.out.println("Value of tested string is:" + palindromValue + " Expected result: false" + "Actual result: is " + isPalindrome(palindromValue));

    }



    private static boolean isPalindrome(String palindromValue) {
        String reverseString = "";
        int stringLength;
        if (palindromValue == null) {
            return false;
        }
        palindromValue = palindromValue.replace(" ", "" );
        palindromValue = palindromValue.toLowerCase();

        stringLength = palindromValue.length();
        for (int i = stringLength -1; i>=0; i--) {
            reverseString = reverseString+ palindromValue.charAt(i);
        }
        return palindromValue.equals(reverseString);
    }











}
