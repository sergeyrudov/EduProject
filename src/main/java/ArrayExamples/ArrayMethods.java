package ArrayExamples;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] array = {1,9,3,0,-8,5,4,1};
        String[] array2 = {"Hello", "World", "Java!"};

        for (int i=0;i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Arrays.sort(array);
        for (int i=0;i<array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int index1 = Arrays.binarySearch(array, 5);
        System.out.println(index1);

        System.out.println();
        System.out.println(array2[1]);

        int index2 = Arrays.binarySearch(array2, "World");
        System.out.println(index2);





    }

}
