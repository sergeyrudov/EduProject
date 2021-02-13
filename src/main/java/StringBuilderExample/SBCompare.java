package StringBuilderExample;

public class SBCompare {

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(ravenstvo(sb1, sb2));
    }

    public static boolean ravenstvo (StringBuilder sb1, StringBuilder sb2) {
        boolean bool = true;
        if(sb1.length() == sb2.length()) {
            for (int i = 0; i<sb1.length(); i++) {
                if(sb1.charAt(i) != sb2.charAt(i)) {
                    bool = false;
                    break;
                }
            }
        } else {
            bool = false;
        }
        return bool;
    }
}
