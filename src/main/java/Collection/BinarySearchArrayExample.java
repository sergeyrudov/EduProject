package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearchArrayExample {
    public static void main(String[] args) {
        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int index = Arrays.binarySearch(array, 150);
        System.out.println(index);


        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.add(-3);
        integers1.add(8);
        integers1.add(12);
        integers1.add(-8);
        integers1.add(0);
        integers1.add(5);
        integers1.add(10);
        integers1.add(1);
        integers1.add(150);
        integers1.add(-30);
        integers1.add(19);

        Collections.sort(integers1);
        Collections.reverse(integers1);
        System.out.println(integers1);
        Collections.shuffle(integers1);
        System.out.println(integers1);
    }
}
