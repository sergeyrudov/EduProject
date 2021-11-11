package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class NegativeToPos {


    static ArrayList<Object> list = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>(List.of(1, 5, -3, 7));
        ArrayList<Integer> data = new ArrayList<>(List.of(101, 4, -220, 1));
        ArrayList<String> surnames = new ArrayList<>(List.of("Sidorov", "Ivanov", "andrey", " ANDROPOV"));


        getPositiveValues(values);
        multipleValues(data);
        searchSurname(surnames);

        sortByStream(data);
        System.out.println(list);


    }

    static void searchSurname(ArrayList<String> surnames) {

        for (String surname: surnames) {
           if(surname.trim().toLowerCase().startsWith("a")) {
               list.add(surname);
               System.out.println(surname.trim());
           }
        }
    }

    static void getPositiveValues(ArrayList<Integer> values) {
        for (Integer value : values) list.add(Math.abs(value));

        for (int i = 0; i < values.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static void multipleValues(ArrayList<Integer> newValues) {
        ArrayList<Integer> listValues = new ArrayList<>(newValues.size());

        for (Integer newValue : newValues) {
            if (newValue % 2 == 0) {
                listValues.add(newValue * 100);
            } else if(newValue % 2 == 1) {
                listValues.add(newValue-100);
            }
        }
        System.out.println(listValues);
    }

    static void sortByStream(ArrayList<Integer> val) {
        Consumer<Integer> mult = s -> { list.add(s*100); };
        Consumer<Integer> minus = s -> { list.add(s-100); };

        val.stream().filter(num -> num % 2 == 0).forEach(mult);
        val.stream().filter(num -> num % 2 == 1).forEach(minus);
    }
}
