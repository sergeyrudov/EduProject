package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class BinarSearch {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(-3);
        integers.add(8);
        integers.add(12);
        integers.add(-8);
        integers.add(0);
        integers.add(5);
        integers.add(10);
        integers.add(1);
        integers.add(150);
        integers.add(-30);
        integers.add(19);
        Collections.sort(integers);
        System.out.println(integers);

        int index1 = Collections.binarySearch(integers, -8);
        System.out.println(index1);
    }
}
