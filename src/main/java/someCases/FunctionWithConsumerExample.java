package someCases;

import lombok.AllArgsConstructor;
import org.assertj.core.api.SoftAssertions;
import org.junit.Before;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FunctionWithConsumerExample {

     static class Car {
        int power;
        String color;
        boolean awd;

        public Car(int power, String color, boolean awd) {
            this.power = power;
            this.color = color;
            this.awd = awd;
        }
    }


    public Supplier<List<Car>> getCar = () -> Arrays.asList(
            new Car(100, "red", true),
            new Car(200, "green", false),
            new Car(300, "blue", true)
    );

     public Supplier<List<String>> getArgs = () -> Arrays.asList("tex", "data", "url");
     public Supplier<List<Object>> differentTypes = () -> Arrays.asList("text", 1, true);


    @Test
    public void checkColor() {
        Function<Car, String> getCarColor = car -> car.color;
        Consumer<String> printColor = color -> assertThat(color).isIn("red", "green", "blue");

        getCar.get().stream()
                .map(getCarColor)
                .forEach(printColor);
    }

    @Test
    public void checkArgs() {
        List<String> args = getArgs.get();
    }

    @Test
    public void diffArgs() {
        String text = (String) differentTypes.get().get(0);
    }
}
