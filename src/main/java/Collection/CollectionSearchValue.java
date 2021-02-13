package Collection;

public class CollectionSearchValue {
    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};

        int min = array[0];
        System.out.println(min);

        for (int i = 1; i<array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("minimum value is: " + min);
    }
}
