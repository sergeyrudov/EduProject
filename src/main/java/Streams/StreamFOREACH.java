package Streams;

import java.util.Arrays;

public class StreamFOREACH {
    public static void main(String[] args) {
        int[] array = {5, 9, 8, 3, 1};
        Arrays.stream(array).forEach(el -> {
            el *= 2;
            System.out.println(el);
        });

        Arrays.stream(array).forEach(el -> {
            System.out.print(el);
        });

        Arrays.stream(array).forEach(System.out::println);

        Arrays.stream(array).forEach(Utils::myMethod);
    }
}

class Utils {
    public static void myMethod(int a) {
        a=a+5;
        System.out.println("Element = " + a);
    }
}