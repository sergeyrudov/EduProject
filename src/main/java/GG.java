public class GG {
    public static void main(String[] args) {
        //verify("heloo");
       // phone("1234567890");
        checkPalindrome("Hwllo world str");
    }

    static boolean verify(String value) {
        try {
            Integer.parseInt(value);
            System.out.println("true");
            return true;
        } catch (Exception e) {
            System.out.println("false");
            return false;


        }
    }

    static boolean phone(String value) {
        if(value.length() ==  10) {
            System.out.println("true");
            return true;
        } else{
            System.out.println("false");
            return false;
        }
    }

    static void checkPalindrome(String value) {
        for (int i=0; i<=value.length();i--) {
            System.out.println(value.charAt(i));        }

    }

}
