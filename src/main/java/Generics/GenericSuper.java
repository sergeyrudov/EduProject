package Generics;


import java.util.ArrayList;
import java.util.List;

class Animal {}
class Dog extends Animal {}
class Puppy extends Dog {}

public class GenericSuper {
    public static void feedAnimalsDogPuppy(List<? super Animal> animals) {
         System.out.println(animals);
    }

    public static void feedDogPuppy(List<? super Dog> animals) {
        System.out.println(animals);
    }

    public static void feedPuppy(List<? super Puppy> animals) {
        System.out.println(animals);
    }

    public static void main(String[] args) {
        List<Animal> animalDogslList = new ArrayList<>();
        animalDogslList.add(new Animal());
        animalDogslList.add(new Dog());
        animalDogslList.add(new Puppy());
        feedAnimalsDogPuppy(animalDogslList);

        List<Dog> dogsPuppies = new ArrayList<>();
        dogsPuppies.add(new Dog());
        dogsPuppies.add(new Puppy());
        feedDogPuppy(dogsPuppies);

        List<Puppy> puppies = new ArrayList<>();
        puppies.add(new Puppy());
        feedPuppy(List.of(new Animal()));
    }
}

