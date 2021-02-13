public class GG {
    public static void main(String[] args) {
        verify("heloo");
        phone("1234567890");
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

}
