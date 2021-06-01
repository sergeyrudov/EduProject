package enumTest;

import java.io.OutputStream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestCase {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4, 1, 2, 4, 1, 3, 2, 1, 2, 3, 4, 4);

        int[] counter = new int[arr.size()];

        for (int i = 0; i < arr.size(); i++) {
            counter[arr.get(i)]++;
        }

        System.out.println("value\tcount");
        for (int i = 0; i < counter.length; i++) {
            System.out.println(i + "\t" + counter[i]);
        }

    }



}


//
// [4, 1, 2, 3]