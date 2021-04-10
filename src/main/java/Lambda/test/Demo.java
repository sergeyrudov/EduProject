package Lambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Std st1 = new Std("Sirko", 22, 110);
        Std st2 = new Std("Merko", 24, 160);
        Std st3 = new Std("Durko", 43, 310);
        Std st4 = new Std("Glevko", 32, 80);
        Std st5 = new Std("Stitstko", 75, 150);
        Std st6 = new Std("Huyko", 52, 177);


        List<Std> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        list.add(st6);


        Stream<Std> str = list.stream().filter(i -> i.getSalary() > 220);

        System.out.println(list.stream().filter(i -> i.getSalary() > 300).findFirst());










    }



}
