package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(30);
        a1.add(150);
        int a = GenMethods.getSecondElement(a1);
        System.out.println(a);

        ArrayList <String> a2 = new ArrayList<>();
        a2.add("Hello");
        a2.add("Privet");
        a2.add("Kak Dela");
        String b = GenMethods.getSecondElement(a2);
        System.out.println(b);

    }

}


class GenMethods {
                      // this T is return type
    public static <T> T getSecondElement(ArrayList<T> a1) {
        return a1.get(1);
    }
}
