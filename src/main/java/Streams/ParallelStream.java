package Streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {

        // 1 2 3 4 ... 100000000000
        // 1 250k
        // 2 500k
        // 3 750k
        // 4 1000k

        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(3.0);
        list.add(8.0);

        double sumResult = list.stream()
                .reduce((accumulator, element) -> accumulator+element).get();
        System.out.println("result = " + sumResult);

        double sumResult1 = list.parallelStream()
                .reduce((accumulator, element) -> accumulator+element).get();
        System.out.println("result = " + sumResult1);

       double divisionResult = list.stream()
                .reduce((accumulator, element) -> accumulator/element).get();
        System.out.println("result = " + divisionResult);

        double divisionResult1 = list.parallelStream()
                .reduce((accumulator, element) -> accumulator/element).get();
        System.out.println("result = " + divisionResult1);
    }
}
