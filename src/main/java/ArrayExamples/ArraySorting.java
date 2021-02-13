package ArrayExamples;

public class ArraySorting {

    public static void main(String[] args) {
        int[] array = {5, 8, -1, -10, 6, 88, 100};
        sorting(array);
        for (int value : array) {
            System.out.println(value);
        }
    }

    private static int[] sorting(int[] array) {
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }
}
