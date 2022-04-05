


public class Fbn {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 1 ;

        int number = 10;
        for (int i=0; i<= number; i++) {
            x = y;
            y = z;
            z = x+y;
            System.out.println(x);

        }
    }
}
