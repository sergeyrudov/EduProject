public class ParseINT {

    public static void main(String[] args) {
        String a = "12345678 ";
        int b = 0;
        try {
            b = Integer.parseInt(a);
        } catch (NumberFormatException e) {
            System.out.println("there is some error in input string " + e);
        }
        System.out.println(b);

        
    }
}
