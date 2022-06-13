package Streams;


import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FuncInter {
    public static void main(String[] args) {
        String t = "privet";
        Predicate<Integer> isMoreThan = v -> v > 10;
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        Function<Double, Long> function = Math::round;
        Supplier<String> supplierStr = t::toUpperCase;
        UnaryOperator<String> uo = String::toUpperCase;
        BinaryOperator<Integer> func2 = Integer::sum;


       // System.out.println(isMoreThan.test(21));
       // printUpperCase.accept("hello world");
       // System.out.println(function.apply(5.7));
       // System.out.println(supplierStr.get());
       // System.out.print(uo.apply("Java 8"));
      // System.out.println(func2.apply(2, 5)); // 5

        Car car1 = new Car("red", 220, true);
        Car car2 = new Car("blue", 150, false);
        Car car3 = new Car("black", 333, true);
        Car car4 = new Car("yellow", 447, false);

        Garage place1 = new Garage(List.of(car1, car2), 1);
        Garage place2 = new Garage(List.of(car3, car4), 2);


        List<Garage> list = new ArrayList<>(List.of(place1, place2));

        Predicate<Car> isAwdDrive = v -> v.isAwd();
        Predicate<Car> isNonAwd = v -> !v.isAwd();

        Predicate<Car> isBlack = c -> c.getColor().equals("black");
        Predicate<Car> isRed = c -> c.getColor().equals("red");
        Predicate<Car> isBlue = c -> c.getColor().equals("blue");
        Predicate<Car> isYellow = c -> c.getColor().equals("yellow");

        Predicate<Car> isPowerMoreThan200 = p -> p.getPower() > 200;
        Predicate<Car> isPowerLessThat230 = p -> p.getPower() < 230;

        Function<Garage, Stream<Car>> makeflat = i -> i.car.stream();
        Function<Garage, Stream<Car>> mapColor = b -> b.getCar().stream();

        Consumer<Car> makePower400 = v -> v.setPower(400);

        List<Car> cars = new ArrayList<>();
        cars = list.stream()
                .flatMap(makeflat)
                .filter(isAwdDrive)
                .filter(isPowerMoreThan200)
                .collect(Collectors.toList());

        cars.forEach(makePower400);


        System.out.println(cars);

    }
}

class Car {
    String color;
    int power;
    boolean isAwd;

    public Car(String color, int power, boolean isAwd) {
        this.color = color;
        this.power = power;
        this.isAwd = isAwd;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setAwd(boolean awd) {
        isAwd = awd;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public boolean isAwd() {
        return isAwd;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", power=" + power +
                ", isAwd=" + isAwd +
                '}';
    }
}

class Garage {
    List<Car> car;
    int place;

    public Garage(List<Car> car, int place) {
        this.car = car;
        this.place = place;
    }

    public List<Car> getCar() {
        return car;
    }

    public int getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "car=" + car +
                ", place=" + place +
                '}';
    }
}
