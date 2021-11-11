package FunctionalInterface;

import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.Scanner;
import java.util.function.*;

@Execution(ExecutionMode.CONCURRENT)
public class Main {
    public static void main(String[] args) {
        Operation<Integer> plus = (Integer value1, Integer value2) -> value1 + value2;
        System.out.println(plus.getResult(31, 54));

        Operation<String> concat = (String value1, String value2) -> value1 + value2;
        System.out.println(concat.getResult("Hello ", "World !"));

        Predicate<Integer> isZero = value -> value == 0;
        System.out.println(isZero.test(0));

        Consumer<String> printer = string -> System.out.println(string);
        printer.accept("Hello world!");

        Function<Integer, Double> converter = value -> Double.valueOf(value);
        System.out.println(converter.apply(12));

        Supplier<String> text = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter text: ");
            return scanner.nextLine();
        };

        System.out.println(text.get());

        UnaryOperator<Double> sqrt = value -> Math.sqrt(value);
        System.out.println(sqrt.apply(8.0));

        BinaryOperator<Double> pow = (value1, value2) -> Math.pow(value1, value2);
        System.out.println(pow.apply(2.0, 5.0));
    }
}
