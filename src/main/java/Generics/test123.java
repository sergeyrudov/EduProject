package Generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Stream;

public class test123 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(21);
        list1.add(21);
        list1.add(3);
        list1.add(456);

        list1.add(789);
        list1.add(345);

        list1.add(80);

        Collections.sort(list1);


        //System.out.println(list1);

        Stream<Integer> test1 = list1.stream().distinct();


        Integer[] stringArray = test1.toArray(Integer[]::new);


        int[] array = Arrays.stream(stringArray).mapToInt(Integer::intValue).toArray();


        System.out.println(Arrays.toString(new int[]{array[1]}));


        System.out.println(verify());


    }


    public static boolean verify() {
        User1 user1 = new User1("Gavr");
        User1 user2 = new User1("Igor");
        List<User1> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        int count = 0;
        long time = System.currentTimeMillis() + 30L;

        System.out.println(
                users
                        .stream()
                        .filter(i -> i.getName().equals("Petr"))
                        .filter(v -> v.getName().equals("Masha"))

        );


        /*while (System.currentTimeMillis() < time) {
            do {
                if(String.valueOf(users.stream().filter(i -> i.name.equals("Masha")))) {
                    System.out.println("1");
                    count++;
                }
            } while (count < 5);

        }
        return false;*/
        return true;
    }
}

@Setter
@Getter
@AllArgsConstructor
@ToString
class User1 {
    String name;
}
