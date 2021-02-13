package Streams;

import java.util.stream.Stream;

public class StreamCOUNT {
    public static void main(String[] args) {
        Stream<Integer> stream5 = Stream.of(1,2,3,4,5,1,2,3,7);

        // стрим нельзя использовать повторно
        // System.out.println(stream5.count());
        System.out.println(stream5.distinct().count());

    }
}
