import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] params) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {

            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    System.out.println("value: " + tmp);
                    array[i] = array[i - 1];
                    System.out.println("here is 64: " + array[i]);
                    array[i - 1] = tmp;
                    System.out.println("tmp:? " + tmp);
                    isSorted = false;
                }
            }
        }
    }
}