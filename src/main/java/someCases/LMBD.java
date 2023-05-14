package someCases;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.val;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
@Setter
class Man {
    String name;
    int age;
}

public class LMBD extends Man{
    public LMBD(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        List<Man> men =
                Arrays.asList(
                        new Man("One", 22),
                        new Man("Second", 43),
                        new Man("Third", 24),
                        new Man("Third", 18));

        Predicate<Man> agePredicate = m -> m.getAge() > 22;
        Predicate<Man> namePredicate = i -> i.getName().equals("Third");


        men.stream()
                .filter(agePredicate)
                .filter(namePredicate)
                .filter(Objects::nonNull)

                .collect(Collectors.toList());

        Man john = men
                .stream()
                .filter(agePredicate)
                .findFirst()
                .get();

        String name = john
                .getName();

        Optional<String> optional = Optional.of(Optional.ofNullable(name).orElse("Jack"));
//        System.out.println(optional.get());

        Comparator<Man> comparator = Comparator.comparingInt(Man::getAge);

        /*men.stream()
                .sorted(comparator)
                .distinct()
                .forEach(System.out::println);*/

    /*    men
                .stream()
                .mapToInt(m -> m.getAge())
                .sum()*/


        System.out.println(men
                .stream()
                .mapToInt(m -> m.getAge())
                .reduce(0, Integer::sum));


    }
}
