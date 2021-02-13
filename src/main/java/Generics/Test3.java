package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
/*        list.add("OK");
        list.add(5);
        list.add(new StringBuilder("Test"));
        list.add(new Car());*/
        list.add("privet");
        list.add("poka");
        list.add("OK");
        list.add("5");
        System.out.println(list.get(1));
        System.out.println(list.indexOf("OK"));
        int a = Integer.parseInt(list.get(3));
        System.out.println(a);
        /*for (String s: list) {
            System.out.println(s + " dlinna " + ((String)s).length());
        }*/

    }
}

class Car{};
