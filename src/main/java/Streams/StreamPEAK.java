package Streams;

import java.util.stream.Stream;

public class StreamPEAK {
    public static void main(String[] args) {
        Stream<Integer> stream5 = Stream.of(1,2,3,4,5,1,2,3,7);

        long stream1 = stream5.distinct().peek(System.out::println).count();
        System.out.println(stream1);

        //System.out.println(stream5.distinct().peek(System.out::println).count());
    }
}
