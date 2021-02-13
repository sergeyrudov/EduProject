package JavaIO;

public class ArrayException {
    public static void main(String[] args) {
        int [] array = {4,8,1};
        System.out.println("Here is array");

        try {
            System.out.println(array[5]);
            System.out.println("Privet");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception was found");
        }
    }
}
