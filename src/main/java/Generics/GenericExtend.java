package Generics;

import java.util.ArrayList;
import java.util.List;

class AnimalEx {}
class DogEx extends AnimalEx {}
class PuppyEx extends DogEx {}

public class GenericExtend {
    public static void feedAnimal(List<? extends AnimalEx> animals) {
        System.out.println(animals);
    }

    public static void feedDogEx(List<? extends DogEx> animals) {
        System.out.println(animals);
    }

    public static void feedPuppyEx(List<? extends PuppyEx> animals) {
        System.out.println(animals);
    }


    public static void main(String[] args) {
        List<AnimalEx> animals = new ArrayList<>();
        animals.add(new AnimalEx());
        animals.add(new DogEx());
        animals.add(new PuppyEx());
        feedAnimal(animals); // OK

        List<DogEx> dogs = new ArrayList<>();
        dogs.add(new DogEx());
        dogs.add(new PuppyEx());
        feedDogEx(dogs); // OK

        List<PuppyEx> puppies = new ArrayList<>();
        puppies.add(new PuppyEx());
        feedPuppyEx(puppies); // OK

      //  feedPuppyEx(List.of(new AnimalEx()));
    }
}
