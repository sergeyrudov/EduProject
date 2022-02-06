package someCases;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

@ToString
@AllArgsConstructor
@Getter
class User {
    String name;
    int age;
    boolean driveLicense;
}

public class PredicateExample {
    public static void main(String[] args) {
        List<User> list = Arrays.asList(
                new User("Pavel", 22, false),
                new User("Igor", 31, true),
                new User("Masha", 43, false),
                new User("Vasya", 31, true),
                new User(null, 1, false)
        );

        Predicate<User> ageFind = i ->i.getAge() > 30;
        Predicate<User> userWithLicense = i -> i.driveLicense;
        Predicate<User> userWithoutLicense = i -> !i.driveLicense;
        Comparator<User> comparator = Comparator.comparingInt(User::getAge);
        ToIntFunction<User> mostOlder = i->i.age;



       // team.stream().mapToInt(i -> i.age).max().orElseThrow(NoSuchElementException::new));

        //list.stream()
       //         .filter(Objects::nonNull)
       //         .filter(ageFind)
       //         .filter(licenseFindTrue)
        //        .forEach(System.out::println);


        List<User> usersWithoutLicense = list.stream()
                .filter(Objects::nonNull)
                .filter(userWithoutLicense)
                .collect(Collectors.toList());


        List<User> sortByAge = usersWithoutLicense.stream()
                .sorted(comparator)
                .collect(Collectors.toList());


        int mostOlderUser = sortByAge.stream()
                .mapToInt(mostOlder).max().orElseThrow(NoSuchElementException::new);

        System.out.println(mostOlderUser);
    }
}
