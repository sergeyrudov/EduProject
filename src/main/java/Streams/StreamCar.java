package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamCar {
    public static void main(String[] args) {
        Auto car1 = new Auto("Audi", 220, true, "red");
        Auto car2 = new Auto("BMW", 320, false, "black");
        Auto car3 = new Auto("Subaru", 400, true, "blue");
        Auto car4 = new Auto("Ford", 160, false, "white");

        List<Auto> list = new ArrayList<>(List.of(car1, car2, car3, car4));

        Predicate<Auto> isAwd = Auto::isAwd;
        Predicate<Auto> nonAwd = i -> !i.isAwd();
        Predicate<Auto> powerMoreThan220 = p -> p.getPower() > 220;
        ToIntFunction<Auto> getPower = Auto::getPower;
        Function<Auto, String> namesAll = Auto::getName;
        Function<Auto, Integer> allPower = Auto::getPower;
        Consumer<Auto> makePower400 = v -> v.setPower(400);


        List<Auto> listWithAWDAndPower220Plus = list.stream()
                .filter(isAwd)
                .filter(powerMoreThan220)
                .collect(Collectors.toList());

        Integer sum = list.stream()
                .mapToInt(getPower)
                .sum();


        String namesConUpperCase = list.stream()
                .map(namesAll)
                .collect(Collectors.joining(", "))
                .toUpperCase();

        List<Auto> carsNonAwd = list.stream()
                .filter(nonAwd)
                .collect(Collectors.toList());

        List<Auto> carsWithAwd = list.stream()
                 .filter(isAwd)
                 .collect(Collectors.toList());


        int totalPowerOfAWDCars = list.stream()
                .filter(isAwd)
                .mapToInt(getPower)
                .sum();


        List<Integer> carPowerListForAWD = list.stream()
                .filter(isAwd)
                .mapToInt(Auto::getPower)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> carPowerListForNonAWD = list.stream()
                .filter(nonAwd)
                .mapToInt(getPower)
                .boxed()
                .collect(Collectors.toList());


        List<Integer> increasePowerForCars = list.stream()
                .filter(nonAwd)
                .mapToInt(i->i.power+200)
                .boxed()
                .collect(Collectors.toList());

        increasePowerForCars(list);
        System.out.println(list);


    }

    public static void increasePowerForCars(List<Auto> list) {
        list.stream()
                .filter(Auto::isAwd)
                .collect(Collectors.toList())
                .forEach(v -> v.power = v.getPower() + 200)
        ;
    }
}


class Auto {
    String name;
    int power;
    boolean awd;
    String color;

    public Auto(String name, int power, boolean awd, String color) {
        this.name = name;
        this.power = power;
        this.awd = awd;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isAwd() {
        return awd;
    }

    public void setAwd(boolean awd) {
        this.awd = awd;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", awd=" + awd +
                ", color='" + color + '\'' +
                '}';
    }
}
