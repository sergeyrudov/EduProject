package Streams;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;


public class StreamCar {
    public static void main(String[] args) throws JsonProcessingException {
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
        Function<Auto, Map<String, Integer>> getReflection = i -> Map.of(Auto.getAuto().getPackageName(), i.getPower());
        Function<Auto, Map<String, Integer>> getNameAndPower = i -> Map.of(i.getName(), i.getPower());
        Function<Auto, Data> getData = i -> new Data(i.getName(), i.getColor(), i.getPower() + 200);
        Function<Auto, String> convertToJson = i -> {
            try {
                return new ObjectMapper()
                        .writer()
                        .withDefaultPrettyPrinter()
                        .writeValueAsString(i);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        };

        UnaryOperator<Auto> increasePower = i -> {
            int v = i.getPower();
            i.setPower(v + 300);
            return i;
        };

        BinaryOperator<Auto> merge = (a, b) -> {
            a.setPower(a.getPower() + b.getPower());
            return a;
        };

        Function<Auto, Map<String, Integer>> getCarAsMap = i -> Map.of(i.getName(), i.getPower());

        var res = list.stream()
                .map(getCarAsMap)
                .collect(Collectors.toMap(Map::keySet, Map::values));

        var autoAsJson = list.stream()
                .map(convertToJson)
                .collect(Collectors.toList());



        BiFunction<Auto, Integer, String> getNameAndPower2 = (i, p) -> i.getName() + " " + p;

        Function<Auto, String> getNameWithPower = i -> i.getName() + " " + i.getPower();


        List<Auto> carWithMaxPower = list.stream()
                .max(Comparator.comparing(Auto::getPower))
                .stream().collect(Collectors.toList());

        List<Auto> sortCarsByName = list.stream()
                .sorted(Comparator.comparing(Auto::getName))
                .collect(Collectors.toList());


        var cars = list.stream()
                .reduce(merge)
                .get();

        List<Auto> carsWithIncreasedPower = list.stream()
                .filter(Auto::isAwd)
                .map(increasePower)
                .collect(Collectors.toList());

        var getPowerFromStreamAsBoolean = list.stream().map(Auto::getPower).mapToDouble(Double::valueOf).anyMatch(p -> p > 220);

        var carOpt = list.stream()
                .filter(Auto::isAwd)
                .max(Comparator.comparing(Auto::getPower))
                .get();

        var powr = list.stream()
                .filter(Auto::isAwd)
                .map(i -> new Data(i.getName(), i.getColor(), i.getPower() + 200))
                .collect(Collectors.groupingBy(Data::getPower));


        var getDataFun = list.stream()
                .map(getData)
                .collect(Collectors.toUnmodifiableList());


        var getNPower = list.stream()
                .map(getNameAndPower)
                .collect(Collectors.toList());

        // object to json
        String json = new ObjectMapper()
                .writer()
                .withDefaultPrettyPrinter()
                .writeValueAsString(list.get(0));

        // convert json to object
        ObjectMapper mapper = new ObjectMapper();
        Map map = mapper.readValue(json, Map.class);

        Gson gson = new Gson();
        JsonParser parser = new JsonParser();
        JsonObject object = (JsonObject) parser.parse(json);
        Auto emp = gson.fromJson(object, Auto.class);



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

        var inct = list.stream()
                .filter(Auto::isAwd)
                .max(Comparator.comparing(Auto::getPower))
                .get();

        var ls4 = list.stream()
                .sorted(Comparator.comparing(Auto::getPower))
                .collect(Collectors.toList());


        var totalPowerForAWDCar = list.stream()
                .filter(Auto::isAwd)
                .mapToInt(Auto::getPower)
                .reduce((acc, elem) -> acc + elem)
                .getAsInt();

        var maxPowerForAwdCar = list.stream()
                .filter(Auto::isAwd)
                .mapToInt(Auto::getPower)
                .boxed()
                .max(Integer::compare);

        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(-2);
        arr.add(8);
        arr.add(102);

        var o = arr.stream()
                .reduce((acc, elem) -> acc*elem)
                .get();


    }

    public static void increasePowerForCars(List<Auto> list) {
        list.stream()
                .filter(Auto::isAwd)
                .collect(Collectors.toList())
                .forEach(v -> v.power = v.getPower() + 200)
        ;
    }
}



class Auto implements Serializable {
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

    public static Class<Auto> getAuto() {
        return Auto.class;
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
@AllArgsConstructor
@Getter
class Data {
    String name;
    String color;
    Integer power;

}
