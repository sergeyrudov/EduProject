package two;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {
        st1 user1 = new st1("Vasya", 66);
        st1 user2 = new st1("Kolya", 47);
        st1 user3 = new st1("Petya", 98);
        st1 user4 = new st1("Masha", 19);



        List<st1> list = new ArrayList<>(List.of(user1, user2, user3, user4));

        // find student which older than 20 y.o
        //list.stream().filter(age -> age.getAge() > 20).forEach(System.out::println);

        // find most young student
        st1 min = list.stream().min((x, y) -> x.getAge() - y.getAge()).get();
       // System.out.println(min);

        st1 max = list.stream().max(Comparator.comparingInt(st1::getAge)).get();
       // System.out.println(max);

        // sort by age
        list = list.stream().sorted(Comparator.comparing(st1::getAge)
        ).collect(Collectors.toList()); // .forEach(System.out::println)

        System.out.println(list);
    }


}


@ToString
@Getter
@AllArgsConstructor
class st1 {
    String name;
    int age;

    public void setAge(int age) {
        this.age = age;
    }
}
