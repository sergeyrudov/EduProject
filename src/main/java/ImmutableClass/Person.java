package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final List<String> hobbies;

    public Person(List<String> hobbies) {
        this.hobbies = new ArrayList<>(hobbies);
    }
    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }

    public static void main(String[] args) {
        List<String> initialHobbies = List.of("Reading", "Cycling");

        Person person = new Person(initialHobbies);

        System.out.println("Hobbies: " + person.getHobbies() + " object hashcode" + person.hashCode());
        String s;

        try {
            s = "a" + "b";
        } finally {

        }
    }
}



